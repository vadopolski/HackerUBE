package theory.questions.finalize;

import java.io.FileReader;

public class FinalizeQuestion {
    private static final String FILENAME = "src/Test.txt";
    
    public static void main(String[] args) throws Throwable {
        NewFile file = new NewFile(new FileReader(FILENAME));

        new NewFile(new FileReader(FILENAME));
        new NewFile(new FileReader(FILENAME));

        System.gc();
        
        try (NewFile rd = new NewFile(new FileReader(FILENAME))){
            System.out.println("test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            System.out.println("Test");
            new NewFile(new FileReader(FILENAME));
            new NewFile(new FileReader(FILENAME));
            rd.close();
        }
        
        System.gc();
    }
}