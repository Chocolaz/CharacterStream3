package characterstream3;

import java.util.Scanner;

public class LAB6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.println(name);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.println(age);
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        System.out.println(height);
    }
}
