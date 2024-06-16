package studentdatebase;

import java.util.Scanner;

public class studentdatebase {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String StudentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;
    public studentdatebase(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите имя студента: ");
        this.firstName = scan.nextLine();
        System.out.println("Введите фамилию студента: ");
        this.lastName = scan.nextLine();
        System.out.println("1 - Первый курс\n2 - Второй курс\n3 - Третий курс\n4 - Четвертый курс\n5 - Магистратура");
        this.gradeYear = scan.nextInt();
        setStudentID();



    }
    private void setStudentID(){
        id++;
        this.StudentID =  gradeYear + "" + id;
    }
    public void enroll(){
        do {


            System.out.print("Введите курс для записи (Q для выхода): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();
            if(!course.equals("Q")){
                courses += " \n" + course;
                tuitionBalance+= costOfCourse;
            }
            else{ break;}
        } while (true);


        System.out.println("Итоговая стоимость: " + tuitionBalance);

    }
    public void viewBalance(){
        System.out.println("Осталось заплатить: " + tuitionBalance);
    }
    public void PayTuit(){
        System.out.print("Введите платеж: ");
        Scanner scan = new Scanner(System.in);
        int payment = scan.nextInt();
        tuitionBalance-= payment;
        System.out.println("Спасибо за платеж в размере " + payment);
        viewBalance();
    }

    public String toString(){
        return "Имя: " + firstName + " " + lastName + "\nКурс: " + gradeYear + "\nID Студента: " +
                StudentID + "\nЗапись на курсы:" + courses + "\nБаланс: " + tuitionBalance;
    }

}
