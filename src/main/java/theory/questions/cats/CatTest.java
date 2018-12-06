package theory.questions.cats;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {
    
    private Cat marsik;
    private Cat belka;
    private Cat belka2;
    
    @Before
    public void setUp() throws Exception {
        marsik = new Cat("Marsik", 8, "white");
        
        List<Cat> belkaKittens = new ArrayList<>();
        belkaKittens.add(new Cat("Chizik", 0, "Yellow"));
        belkaKittens.add(new Cat("Chizik", 0, "Yellow"));
        belkaKittens.add(new Cat("Tom", 0, "Grey"));
    
        belka = new Cat("Belka", 5, "black", belkaKittens);
    
        List<Cat> belkaKittens2 = new ArrayList<>();
        belkaKittens2.add(new Cat("Cat", 0, "White"));
        belkaKittens2.add(new Cat("Grey", 0, "Red"));
        belkaKittens2.add(new Cat("Mark", 0, "Black"));
        
        belka2 = new Cat("Belka", 5, "black", belkaKittens2);
    }
    
    @Test
    public void testEquals_differentCat_false() {
        assertFalse(belka.equals(belka2));
        assertTrue(belka.equals(belka));
        assertFalse(belka.equals(marsik));
    }
    
    @Test
    public void testHashCode_differentCat_differentHash() {
        assertNotEquals(belka.hashCode(), belka2.hashCode());
        assertEquals(belka.hashCode(), belka.hashCode());
        assertNotEquals(belka.hashCode(), belka2.hashCode());
    }
}