package characterstream3;

import java.io.*;

public class LAB3 {
    public static void main(String[] args) {
        PrintWriter output = null;
        try {
            output = new PrintWriter("data.txt");
            output.println("Hello World!");
            output.println("Welcome to Java");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175.0);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s=input.readLine()) !=null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
