package day12;

import java.util.Optional;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Cat cat = new Cat("Mars");

        System.out.println(cat.name);



        Optional<Cat> optionalCat = Optional.of(cat);

        optionalCat.get().setName("NewMars");

        System.out.println(cat.name);

        cat = null;

        Optional<Cat> optionalCat2 = Optional.ofNullable(cat);

        optionalCat2.get().setName("NoMars");




    }
}
