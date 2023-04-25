    package characterstream3;

    import java.io.*;
    import java.util.Scanner;

    public class LAB4 {
        public static void main(String[] args) {
            try {
                FileReader file = new FileReader("data.txt");
                Scanner input = new Scanner(file);
                String hello = input.nextLine();
                System.out.println(hello);
                String welcome = input.nextLine();
                System.out.println(welcome);
                String name = input.nextLine();
                System.out.println(name);
                int age = input.nextInt();
                System.out.println(age);
                double weight = input.nextDouble();
                System.out.println(weight);
                double height = input.nextDouble();
                System.out.println(height);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
}

