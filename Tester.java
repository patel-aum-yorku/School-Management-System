/**
 * Author:- Aum Patel
 */
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;


import static org.junit.Assert.*;

public class Tester {
    //test to check student class
    @Test
    public void test1(){
        Student s1 = new Student(111,"Aum","10A");
        assertEquals("Aum",s1.getStudentName());
        assertEquals(111,s1.getStudentId());
        assertEquals("10A",s1.getStudentClass());
        s1.setStudentClass("12B");
        assertEquals("12B",s1.getStudentClass());
    }
    //test to check teacher class
    @Test
    public void test2(){
        Teacher t1 = new Teacher(123,"Jackie",1000);
        assertEquals("Jackie",t1.getTeacherName());
        assertEquals(123,t1.getTeacherId());
        assertEquals(1000,t1.getSalary(),0.1);
        assertEquals(0,t1.getSalaryPayment(),0.1);
        t1.setSalary(2000);
        assertEquals(2000,t1.getSalary(),0.1);
    }
    //test to check school class
    @Test
    public void test3(){
        /*
         * creating teacher objects
         */
        Teacher t1 = new Teacher(11,"Rati",1000);
        Teacher t2 = new Teacher(22,"Neelam",900);
        Teacher t3 = new Teacher(33,"Beena",1500);
        /*
         * creating student objects
         */
        Student s1 = new Student(1,"Aum","12A");
        Student s2 = new Student(2,"Raj","10B");
        Student s3 = new Student(3,"Ravi","9C");

        //create lists of teachers and students
        List<Teacher> listOfTeacher = new ArrayList<>();
        List<Student> listOfStudent = new ArrayList<>();

        //add all the teacher instances to the list
        listOfTeacher.add(t1);
        listOfTeacher.add(t2);
        listOfTeacher.add(t3);

        //add all the student instances to the list
        listOfStudent.add(s1);
        listOfStudent.add(s2);
        listOfStudent.add(s3);

         /*
        making a school instance with all the data
         */
        School Lassonde = new School(listOfTeacher,listOfStudent);
        assertEquals(listOfStudent,Lassonde.getStudent());
        assertEquals(listOfTeacher,Lassonde.getTeacher());
    }

    //test to check the payment and salary system
    @Test
    public void test4(){
        /*
         * creating teacher objects
         */
        Teacher t1 = new Teacher(11,"Rati",1000);
        Teacher t2 = new Teacher(22,"Neelam",900);
        Teacher t3 = new Teacher(33,"Beena",1500);
        /*
         * creating student objects
         */
        Student s1 = new Student(1,"Aum","12A");
        Student s2 = new Student(2,"Raj","10B");
        Student s3 = new Student(3,"Ravi","9C");

        //create lists of teachers and students
        List<Teacher> listOfTeacher = new ArrayList<>();
        List<Student> listOfStudent = new ArrayList<>();

        //add all the teacher instances to the list
        listOfTeacher.add(t1);
        listOfTeacher.add(t2);
        listOfTeacher.add(t3);

        //add all the student instances to the list
        listOfStudent.add(s1);
        listOfStudent.add(s2);
        listOfStudent.add(s3);

         /*
        making a school instance with all the data
         */
        School Lassonde = new School(listOfTeacher,listOfStudent);

        //----------------------
        s1.Pay(15000);
        s2.Pay(10000);
        s3.Pay(13000);

        //checking fees paid method
        assertEquals(15000,s1.getFeesPaid(),0.1);
        assertEquals(10000,s2.getFeesPaid(),0.1);
        assertEquals(13000,s3.getFeesPaid(),0.1);

        //checking due fees method
        assertEquals("5000.0",s1.dueFees());
        assertEquals("10000.0",s2.dueFees());
        assertEquals("7000.0",s3.dueFees());

        //checking the money earned by school
         assertEquals(38000,Lassonde.getMoneyEarned(),0.1);

        t1.salaryPayment(t1.getSalary());
        t2.salaryPayment(t2.getSalary());
        t3.salaryPayment(t3.getSalary());
         //checking salary payment method
        assertEquals(1000,t1.getSalaryPayment(),0.1);
        assertEquals(900,t2.getSalaryPayment(),0.1);
        assertEquals(1500,t3.getSalaryPayment(),0.1);
    }


}
