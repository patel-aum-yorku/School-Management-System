/**
 * Author:- Aum Patel
 * This class contains data related to teachers
 * ie:name,id and salary
 */
public class Teacher {
    private final int teacherId;
    private final String teacherName;
    private double salary;
    private double salaryPayment;

    /**
     * Creates new Teacher by initializing the parameters
     * @param Id - unique id for teacher
     * @param name - name of teacher
     * @param salary- salary of teacher
     */
    public Teacher(int Id,String name,double salary){
        this.teacherName = name;
        this.teacherId = Id;
        this.salary = salary;
        this.salaryPayment = 0;
    }

    /**
     *access teacher's id
     * @return ID
     */
    public String getTeacherName(){
        return this.teacherName;
    }

    /**
     *access teacher's name
     * @return NAME
     */
    public int getTeacherId() {
        return this.teacherId;
    }

    /**
     *access teacher's salary
     * @return SALARY
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * set teacher's salary
     *
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     *update the teachers salary aw well as school total money earned
     * @param amt - salary paid to teacher
     */
    public void salaryPayment(double amt){
      this.salaryPayment += amt;
      School.setMoneySpent(amt);
    }

    /**
     * to get salary payment
     * @return - amount of salary paid by the school
     */
    public double getSalaryPayment() {
        return salaryPayment;
    }
}
