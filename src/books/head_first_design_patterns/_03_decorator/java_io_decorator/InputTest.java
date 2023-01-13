package books.head_first_design_patterns._03_decorator.java_io_decorator;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("/home/azad/Workspaces/java/design-pattern-learning/src/books" +
                                    "/head_first_design_patterns/_03_decorator/java_io_decorator/test.txt")));

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
