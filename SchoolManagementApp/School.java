package SchoolManagementApp;

import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {

        String schoolName = "School # 882 name after Albert Einstein";

        Teacher t1 = new Teacher(2501, "John", "Doe", 'M', 36, "Math", 9);
        Teacher t2 = new Teacher(2511, "Kimberly", "Clark", 'F', 29, "Chemistry", 7);
        Teacher t3 = new Teacher(2521, "Johny", "Walker", 'M', 43, "Physics", 5);
        Teacher t4 = new Teacher(2531, "Johnson and", "Johnson", 'M', 36, "Math", 11);
        Teacher t5 = new Teacher(2541, "Marie", "Belle", 'F', 28, "French", 7);
        Teacher t6 = new Teacher(2551, "Bonny", "Clyde", 'M', 25, "Math", 3);

        Cook c1 = new Cook(3971, "Jim", "Cock", 'M', 44, 17);
        Cook c2 = new Cook(3971, "Alicia", "Keys", 'F', 41, 12);

        Nurse nurse = new Nurse(4801, "Jennifer", "Anniston", 'F', 65, 25);
//(int id, String firstName, String lastName, char gender, int age, double tuitionFee)
        Student st1 = new Student(6701, "John", "Doe", 'M', 36, 25000 );
        Student st2 = new Student(6711, "Kimberly", "Clark", 'F', 29, 32000);
        Student st3 = new Student(6721, "Johny", "Walker", 'M', 43, 29000);
        Student st4 = new Student(6731, "Johnson and", "Johnson", 'M', 36, 26750);
        Student st5 = new Student(6741, "Marie", "Belle", 'F', 28, 32000);
        Student st6 = new Student(6751, "Bonny", "Clyde", 'M', 25, 25000);



        ArrayList<Teacher> schoolTeachers = new ArrayList<>(Arrays.asList(t1, t2, t3, t4, t5, t6));
        ArrayList<Student> students = new ArrayList<>(Arrays.asList(st1, st2, st3, st4, st5, st6));

        ArrayList<Cook> schoolCooks = new ArrayList<>();
        schoolCooks.addAll(Arrays.asList(c1,c2));

        System.out.println(schoolTeachers);

        System.out.println(Teacher.searchById(schoolTeachers, 2541));
        System.out.println();

        System.out.println(Student.searchById(students, 6751));
        System.out.println();

        System.out.println(Cook.searchById(schoolCooks, 3971));


        st1.payTuitionFee(18000);
        System.out.println(st1.getFirstName() + " " + st1.getLastName() + "tuition fee debt: " + st1.getTuitionFee());

        Accountant accountant = new Accountant(5288, "Melinda", "Gates", 'F', 69, 45);
        Accountant.setSchoolBalance(500000);
        accountant.paySalary(t3, t3.getFinalSalary());
        Accountant.printSchoolBalance();
        Teacher.printBankAccount(t3);

        accountant.paySalary(t4, t4.getFinalSalary());
        Accountant.printSchoolBalance();
        Teacher.printBankAccount(t4);




    }
}
