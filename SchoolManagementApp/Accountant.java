package SchoolManagementApp;

import java.util.Scanner;

public class Accountant extends Employee {

    private static double schoolBalance;

    public Accountant(int id, String firstName, String lastName, char gender, int age, int experience ) {
        super(id, firstName, lastName, gender, age, "accountant", experience, 0);
    }

    public static double getSchoolBalance() {
        return schoolBalance;
    }

    public static void printSchoolBalance() {
        System.out.println("School balance: " + schoolBalance);
    }

    public static void setSchoolBalance(double schoolBalance) {
        if (schoolBalance < 0) {
            System.err.println("Invalid balance provided: " + schoolBalance);
        }
        Accountant.schoolBalance = schoolBalance;
    }

    public void paySalary(Teacher teacher, double salaryAmount){
        System.out.println("You're trying to pay salary to teacher: id " + getId() + " '"  + teacher.getFirstName() + " " + teacher.getLastName() + "\' to be able to perform this operation you must be logged in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your login: ");
        String login = scanner.next();
        System.out.println("Please enter your password: ");
        String password = scanner.next();
        if (login.equals("Admin") && password.equals("admin123")){
            System.out.println("Successful login. Enter the salary amount.");
            if (salaryAmount > schoolBalance){
                System.err.println("You have insufficient funds");
            }else{
                schoolBalance -= salaryAmount;
                teacher.setBankAccount(salaryAmount);
                System.out.println("\n₽ " + salaryAmount + " has been successfully transferred to " + teacher.getFirstName() + " " + teacher.getLastName() + "'s bank account");
            }
        }else{
            System.err.println("Incorrect login or password.\nOperation has not been completed.");
            System.exit(1);

        }
    }

    @Override
    public String toString() {
        return "Accountant\n" +
                "name: " + getFirstName() +
                ", last name: "  + getLastName() +
                ", gender: '" + getGender() + '\'' +
                ", experience: "  + getExperience() +
                ", salary: " + getFinalSalary() +
                ", bank account has: ₽ " + getBankAccount()
                ;
    }
}
