import java.util.List;
/**
 * Author:- Aum Patel
 * This class contains data related to school
 * ie:teachers, students, money earned and money spent
 */
public class School {
    private List<Teacher> teacher ;
    private List<Student> student ;
    private static double moneyEarned;
    private static double moneySpent;

    /**
     * school object
     * @param teacher - list of teacher
     * @param student - list of student
     */
    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        this.moneyEarned = 0;
        this.moneySpent = 0;
    }

    /**
     * access list of teacher
     * @return - list of teachers
     */
    public List<Teacher> getTeacher() {
        return teacher;
    }

    /**
     * insert teacher to the list
     * @param t
     */
    public void insertTeacher(Teacher t) {
         this.teacher.add(t);
    }

    /**
     * access list of student
     * @return - list of students
     */
    public List<Student> getStudent() {
        return student;
    }

    /**
     * insert student to the list
     * @param s
     */
    public void insertStudent(Student s) {
        this.student.add(s);
    }

    /**
     * access money earned
     * @return - money earned
     */
    public double getMoneyEarned() {
        return moneyEarned;
    }

    /**
     * set the amount of money earned
     * @param amt
     */
    public static void  setMoneyEarned(double amt) {
        moneyEarned += amt;
    }

    /**
     * access money spent
     * @return - money spent
     */
    public double getMoneySpent() {
        return moneySpent;
    }

    /**
     * update the amount of money spent by giving the salary
     * @param
     */
    public static void setMoneySpent(double amt) {
       moneySpent = amt;
       moneyEarned -= amt;
    }
}
