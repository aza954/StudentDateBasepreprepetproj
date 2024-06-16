package studentdatebase;

import java.util.Scanner;

public class studentdatebaseapp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите количество студентов");
        int countOfStudents = scan.nextInt();
        studentdatebase[] students = new studentdatebase[countOfStudents];
        for (int i =0; i<students.length;i++){
            students[i] = new studentdatebase();
            students[i].enroll();
            students[i].PayTuit();

        }



    }

}