package SchoolManagementApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Teacher extends Employee{

    private String subject;


    public Teacher(int id, String firstName, String lastName, char gender, int age,  String subject, int experience) {
        super(id, firstName, lastName, gender, age, "Teacher", experience, 0);
        setSubject( subject );
    }

    static {
        setBasicSalary(25000);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if (subject.isEmpty() || subject.isBlank()){
            System.err.println("Field subject can't be empty or blank");
            System.exit(1);
        }
        for (int i = 0; i < subject.length(); i++) {
            if (!Character.isLetterOrDigit(subject.charAt(i))){
                if (subject.charAt(i) == ' '){
                    continue;
                }
                System.out.println("Subject name must contain letters and numbers only: '" + subject + '\'');
                System.exit(1);
            }
        }
        this.subject = subject;
    }

    /*
    ArrayList <Teacher> teachers = new ArrayList<>();

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void addTeachers(Teacher[] teachers){
        this.teachers.addAll(Arrays.asList(teachers));
    }

     */


    public static String searchById(ArrayList<Teacher> teachers, int id){
        String result = "invalid id provided, check id and try again: '" + id + '\'';
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == id){
                result = "Teacher found: \nname: '" + teachers.get(i).getFirstName() +" " + teachers.get(i).getLastName() +
                "', " + teachers.get(i).getSubject() + " " + teachers.get(i).getJobTitle();
            }
        }
        return result;
}

    public static void printBankAccount(Teacher teacher){
        System.out.println("\nAvailable balance at " + teacher.getFirstName() + " " + teacher.getLastName() + "'s account: ₽ " +teacher.getBankAccount());
    }


    @Override
    public String toString() {
        return "\nTeacher:\n" +
                "id " + getId() +
                ", first name: '" + getFirstName() + '\'' +
                ", last name: '" + getLastName() + '\'' +
                ", age: '" + getAge() + '\'' +
                ", gender: '" + getGender() + '\''+
                ", job title: " + getJobTitle() +
                ", subject='" + subject + '\'' +
                ", experience: " + getExperience() +
                ", basic salary: " + getBasicSalary() +
                ", bonus according to experience: " + getBonus()+
                ", final salary: " + getFinalSalary()+
                ", bank account has: ₽ " + getBankAccount() ;
    }
}
