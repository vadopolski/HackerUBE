package theory.questions.cats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Cat {
    private final String name;
    private final int age;
    private final String color;
    private final List<Cat> kittens;
    
    public Cat(String name, int age, String color) throws IllegalAccessException {
        if (name == null || name == "") throw new IllegalArgumentException();
        this.name = name;
        this.age = age;
        this.color = color;
        this.kittens = new ArrayList<>();
    }

    public Cat(String name, int age, String color, List<Cat> kittens) throws IllegalAccessException {
        if (name == null || name == "") throw new IllegalArgumentException(name);
        this.name = name;
        if (age < 0) throw new IllegalArgumentException(String.valueOf(age));
        this.age = age;
        if (color == null || name == "") throw new IllegalArgumentException(color);
        this.color = color;
        if (kittens == null) throw new IllegalArgumentException();
        this.kittens = new ArrayList<>(kittens);
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getColor() { return color; }
    
    public List<Cat> getKittens() { return new ArrayList<>(kittens); }
    
    @Override public int hashCode() {
        int result = age + 7 * (name.hashCode() + color.hashCode());
        
        if (kittens.size() == 0)
            return result;
        
        int hashForKittens = 1;
        for (Cat cat : kittens)
            hashForKittens = hashForKittens * 7 + cat.name.hashCode() + cat.color.hashCode();
        
        return result + hashForKittens;
    }
    
    @Override public boolean equals(final Object obj) {
        if (!(obj instanceof Cat)) return false;
        
        final Cat cat = (Cat)obj;
        
        if (!name.equals(cat.name))
            return false;
        
        if (age != cat.age)
            return false;
        
        if(color != cat.color)
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

    public static void main(String[] args) {

    }
}