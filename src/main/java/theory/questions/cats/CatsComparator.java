package theory.questions.cats;

import java.util.Comparator;

public class CatsComparator implements Comparator<Cat> {
    @Override public int compare(Cat c1, Cat c2) {
        int result = c1.getName().compareTo(c2.getName());
        
        if (result == 0)
            return result;
        
        return c1.getAge() - c1.getAge();
    }
}
