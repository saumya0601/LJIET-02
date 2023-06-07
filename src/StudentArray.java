import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = new String[5];        //array of stud names

        int count = 0;
        do {
            System.out.print("Enter the name of student " + (count + 1) + ": ");
            String name = sc.nextLine();

            students[count] = name;
            count++;

        } while (count < 5);

        System.out.println("\nStudent names:");

        // Display the stud names
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }


    }
}
