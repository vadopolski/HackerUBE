package theory.questions.autoboxing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestBoxing {
    
    public static void main(String[] args) {
        List<Integer> l5 = new ArrayList<>();
        
//        problem with adding/removing elements
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(new Integer(3));
        numbers.add(new Integer(5));
        numbers.remove(1);
        numbers.remove(new Integer(5));
        System.out.println(numbers);
        
//        equals problem
        Long l = 0L;
        System.out.println(l.equals(0L));
        System.out.println(l.equals(0));
        System.out.println(l == 0L);
        System.out.println(l == 0);
        
//       hides the object creation, which can lead to a big performance loss
//        ‘counter++’ equals Integer.valueOf(counter.intValue() + 1)
        Integer counter = 0;
        for(int i=0; i < 1000; i++) {
            counter++;
        }
//    Overloading problem, no convertation between Integer and Long
        Integer ll = 0;
        fubar(ll);
    
// NPE when converting null to wrapper class
        HashMap<String, Integer> map = new HashMap<>();
        Integer hello = map.get("hello");
    
        System.out.println(hello);
        int hello2 = map.get("hello");
    }
    
    static void fubar(long b) {
        System.out.println("1");
    }
    static void fubar(Long b) {
        System.out.println("2");
    }
}
