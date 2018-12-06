package theory.questions.cats;

import java.util.Comparator;

public class CatsComparator implements Comparator<Cat> {
    @Override public int compare(Cat c1, Cat c2) {
        int nameResult = c1.getName().compareTo(c2.getName());
        
        if (nameResult != 0)
            return nameResult;
        
        int colorResult = c1.getColor().compareTo(c2.getColor());
        
        if (colorResult != 0)
            return colorResult;
        
        int ageResult = c1.getAge() - c1.getAge();
        
        if (ageResult != 0)
            return ageResult;
        
        return c1.getKittensCount() - c2.getKittensCount();
    }
}
