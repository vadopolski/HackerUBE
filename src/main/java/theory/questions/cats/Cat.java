package theory.questions.cats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Cat {
    private final String name;
    private int age;
    private List<Cat> kittens;
    
    public Cat(String name, int age) throws IllegalAccessException {
        if (name == null || name == "") throw new IllegalArgumentException();
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public List<Cat> getKittens() {
        return kittens;
    }
    
    public void addKittens(final Cat kitten) {
        if (kitten.age != 0) throw new IllegalArgumentException();
        if (kittens == null) kittens = new ArrayList<>();
        kittens.add(kitten);
    }
    
    @Override public int hashCode() {
        int result = age + 7 * name.hashCode();
        
        if (kittens.size() == 0 || kittens == null)
            return result;
        
        int hashForKittens = 1;
        for (Cat cat : kittens)
            hashForKittens = hashForKittens * 7 + cat.name.hashCode();
        
        return result + hashForKittens;
    }
    
    @Override public boolean equals(final Object obj) {
        if (!(obj instanceof Cat)) return false;
        
        final Cat cat = (Cat)obj;
        
        if (!name.equals(cat.name))
            return false;
        
        if (age != cat.age)
            return false;
        
        if ((kittens == null || kittens.size() == 0) && (cat.kittens == null || cat.kittens.size() == 0))
            return true;
        
        if ((kittens == null && cat.kittens != null) || (kittens != null && cat.kittens == null)
            || kittens.size() != cat.kittens.size())
            return false;
    
        CatsComparator comparator = new CatsComparator();
        
        Collections.sort(kittens, comparator);
        Collections.sort(cat.kittens, comparator);
        
        return kittens.equals(cat.kittens);
    }
}