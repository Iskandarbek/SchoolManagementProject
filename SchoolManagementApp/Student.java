package SchoolManagementApp;

import java.util.ArrayList;
import java.util.Arrays;

public class Student extends Person{
    private double tuitionFee;

    public Student(int id, String firstName, String lastName, char gender, int age, double tuitionFee) {
        super(id, firstName, lastName, gender, age);
        this.tuitionFee = tuitionFee;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        if (tuitionFee < 0){
            System.err.println("Invalid tuition fee value provided: '" + tuitionFee + '\'');
            System.exit(1);
        }
        this.tuitionFee = tuitionFee;
    }

    public void payTuitionFee(double paidSum){
        tuitionFee = tuitionFee - paidSum;
    }

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void addStudents(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }

    public static String searchById(ArrayList<Student>students, int id){
        String result = "Invalid id provided. Check the id and try again." + id;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id){
                result = "Student found \nname: '" + students.get(i).getFirstName() + " " + students.get(i).getLastName() + "', tuition fee debt: " +
                        students.get(i).getTuitionFee();
            }
        }return result;
    }

    @Override
    public String toString() {
        return "Student: \n" +
                "id " + getId() +
                ", first name: '" + getFirstName() + '\'' +
                ", last name: '" + getLastName() + '\'' +
                ", age: '" + getAge() + '\'' +
                ", gender: '" + getGender() + '\''+
                ", tuitionFee=" + tuitionFee +
                "\n";
    }
}
