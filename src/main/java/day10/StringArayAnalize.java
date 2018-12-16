package day10;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class StringArayAnalize extends RecursiveTask {
    private String[] input = new String[100];
    private int startPos;
    private int endPos;
    private int UNIT_SIZE;

    public StringArayAnalize(String[] input, int startPos, int endPos) {
        this.input = input;
        this.startPos = startPos;
        this.endPos = endPos;
    }

    @Override
    protected Map<Character, Integer> compute() {
        final int currentSize = endPos - startPos;
        if(currentSize <= UNIT_SIZE){
            return computeAll();
        } else {
            int center = currentSize/2;

            int leftEnd = startPos + center;
            StringArayAnalize leftSum = new StringArayAnalize(input, startPos, leftEnd);
            leftSum.fork();
            int rightStar = startPos + center + 1;
            StringArayAnalize rightSum = new StringArayAnalize(input, rightStar, endPos);
            rightSum.fork();
            return null;

        }


    }




    public Map<Character, Integer> computeAll(){
        Map<Character, Integer> map = new HashMap<>();

        for(int i = startPos; i < endPos; i++){
            for(int j = 0; j < input[j].length(); j++){
                Character c = input[j].charAt(j);
                if(!map.containsKey(c)) map.put(c, 0);
                map.put(c, map.get(c) +1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        String[] input = new String[100];
//        StringArayAnalize stringArayAnalize = new StringArayAnalize()
        for (int i = 0; i < input.length; i++) {
            input[i] = "kasdhkasd . lsajdlasjdlkajsd";
        }

        ForkJoinPool pool = new ForkJoinPool();

    }
}
