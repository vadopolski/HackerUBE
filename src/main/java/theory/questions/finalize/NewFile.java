package theory.questions.finalize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class NewFile extends BufferedReader {
    @Override public void close() throws IOException {
        System.out.println("Closing");
        super.close();
    }
    
    @Override protected void finalize() throws Throwable {
        System.out.println("Finalizing");
        super.finalize();
    }
    
    public NewFile(Reader in) {
        super(in);
    }
    
}
