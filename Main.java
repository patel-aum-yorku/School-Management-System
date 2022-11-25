import java.util.ArrayList;
import java.util.List;

/**
 * Author:- Aum Patel
 */
public class Main {
    public static void main(String[] args) {
        /*
         * Initiating teacher objects
         */
        Teacher t1 = new Teacher(1,"Rati",1000);
        Teacher t2 = new Teacher(2,"Neelam",900);
        Teacher t3 = new Teacher(3,"Beena",1500);

        /*
        insert teacher object to the list
         */
        List<Teacher> listOfTeacher = new ArrayList<>();
        listOfTeacher.add(t1);
        listOfTeacher.add(t2);
        listOfTeacher.add(t3);

        /*
        Initiating student object
         */
        Student s1 = new Student(1,"Aum","12A");
        Student s2 = new Student(2,"Raj","10B");
        Student s3 = new Student(3,"Ravi","9C");

        /*
        insert student object in student list
         */
        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(s1);
        listOfStudent.add(s2);
        listOfStudent.add(s3);

        /*
        making a new school with all the data
         */
        School Lassonde = new School(listOfTeacher,listOfStudent);
        System.out.println(" ");
        System.out.println("Lassonde's total balance: "+Lassonde.getMoneyEarned()+"$");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------");


        //output - 0$

        /*
        students pay fees
         */
        System.out.println(" ");
        System.out.println("First Semester Payment");
        System.out.println("______________");
        s1.Pay(15000);
        s2.Pay(10000);
        s3.Pay(13000);
        System.out.println("Amount Paid By Aum: "+s1.getFeesPaid()+"$" +" | Due Amount: "+s1.dueFees()+" | Total fees: "+s1.getFeesTotal()+"$");
        System.out.println("Amount Paid By Raj: "+s2.getFeesPaid()+"$" +" | Due Amount: "+s2.dueFees()+" | Total fees: "+s2.getFeesTotal()+"$");
        System.out.println("Amount Paid By Ravi: "+s3.getFeesPaid()+"$" +" | Due Amount: "+s3.dueFees()+" | Total fees: "+s3.getFeesTotal()+"$");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");

        //checking lassonde's balance again
        System.out.println("Lassonde's total balance: "+Lassonde.getMoneyEarned()+"$");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------");

        //salary of teachers
        System.out.println(" ");
        System.out.println("Salary Payment");
        System.out.println("______________");
        t1.salaryPayment(t1.getSalary());
        t2.salaryPayment(t2.getSalary());
        t3.salaryPayment(t3.getSalary());
        System.out.println("Amount received by "+t1.getTeacherName()+" as salary: "+t1.getSalary());
        System.out.println("Amount received by "+t2.getTeacherName()+" as salary: "+t2.getSalary());
        System.out.println("Amount received by "+t3.getTeacherName()+" as salary: "+t3.getSalary());
        System.out.println(" ");
        System.out.println("----------------------------------------------------------");
        System.out.println(" ");

        //checking lassonde's balance again
        System.out.println("Lassonde's total balance: "+Lassonde.getMoneyEarned()+"$");









    }
}