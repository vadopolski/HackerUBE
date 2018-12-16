package day2.composition;

public class Home {

    Cat cat;

    public Home(Cat cat) {
        this.cat = cat;
    }

    public void  printHomeName(){
        System.out.println(cat.name + "`s Home");
    }
}
