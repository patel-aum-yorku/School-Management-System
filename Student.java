/**
 * Author:- Aum Patel
 * This class contains data related to students
 * ie: name, id, fees , and class
 */

public class Student {
    //Attributes of students
    private final int studentId;
    private final String studentName;
    private String Class;
    private double paidAmount;
    private final double feesTotal;

    //Constructor for student class
    /**
     * Fees for every student will be $20,000
     * Fees paid by student will be 0 at start
     * Creates new student by initializing the parameters
     * @param Id - unique id for student
     * @param name- name of student
     * @param Class- class of student
     */
    public Student(int Id,String name,String Class){
        this.studentId = Id;
        this.studentName = name;
        this.Class = Class;
        paidAmount = 0;
        feesTotal = 20000;


    }

    /**
     *access student's id
     * @return - Id
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     *access student's name
     * @return - name
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     *access student's class
     * @return - Class
     */
    public String getStudentClass() {
        return Class;
    }

    /**
     *access student fees paid
     * @return - fees paid
     */
    public double getFeesPaid() {
        return paidAmount;
    }

    /**
     *access student's total fees
     * @return - total fees
     */
    public double getFeesTotal() {
        return feesTotal;
    }

    /**
     * Update the class of student
     * @param Class - update the class
     */
    public void setStudentClass(String Class){this.Class = Class;}

    /**
     * School receives fees payment from the student
     * Add the fees to feesPaid
     * ie: feesPaid = 1000 + 5000 + 4000 = 10000
     * keep updating the feesPaid parameter
     *
     * @param fees - update fees paid
     */
    public void Pay(double fees){
        paidAmount += fees;
        School.setMoneyEarned(fees);
    }

    /**
     *
     * @return - due fees is returned
     */
    public String dueFees(){

        if(paidAmount>=feesTotal) {
            return (feesTotal - paidAmount) + "$ Your fees are already paid!";
        }
        return String.valueOf(feesTotal - paidAmount);
    }

    /*
     * We don't need to update anything else
     */

}
