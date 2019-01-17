package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import org.junit.Assert;

public class StringCount extends RecursiveTask<Map<Character, Integer>> {
    private static final int UNIT_SIZE = 1;
    private final String[] values;
    private int startPos, endPos;
    
    public StringCount(final String[] values) {
        this(values, 0, values.length);
    }
    
    public StringCount(final String[] values, int startPos, int endPos) {
        this.values = values;
        this.startPos = startPos;
        this.endPos = endPos;
    }
    
    protected Map<Character, Integer> compute() {
        final int currentSize = endPos - startPos;
        if (currentSize <= UNIT_SIZE) {
            return computeSum();
        }
        else {
            int center = currentSize / 2;
            int leftEnd = startPos + center;
            StringCount leftSum = new StringCount(values, startPos, leftEnd);
            leftSum.fork();
            int rightStart = startPos + center;
            StringCount rightSum = new StringCount(values, rightStart, endPos);
            Map<Character, Integer> map = rightSum.compute();
            Assert.assertNotNull(map);
            if (!rightSum.isCompletedNormally()) {
                map = rightSum.computeSum();
            }
            Map<Character, Integer> map1 = null;
            if (!leftSum.isCompletedNormally()) {
                map1 = leftSum.computeSum();
            }
            Assert.assertNotNull(map1);
            for (Character character : map1.keySet()) {
                if (!map.containsKey(character))
                    map.put(character, 0);
                map.put(character, map1.get(character) + map.get(character));
            }
            return map;
        }
    }
    
    private Map<Character, Integer> computeSum() {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = startPos; i < endPos; i++) {
            if (values[i] == null) break;
            for (int j = 0; j < values[i].length(); j++) {
                Character c = values[i].toLowerCase().charAt(j);
                if (!map.containsKey(c)) map.put(c, 0);
                map.put(c, map.get(c) + 1);
            }
        }
        if (map.size() == 0)map.put(' ', 0);
        return map;
    }
    
    public static void main(String[] args) {
        String[] stringArray = new String[100];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "ldlihnvlCdnfcs;dgnhreieue tr;srdrgy    rfguhy.";
        }
        ForkJoinPool pool = new ForkJoinPool();
        StringCount calculator = new StringCount(stringArray);
        System.out.println(pool.invoke(calculator));
    }
}