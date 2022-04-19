package SchoolManagementApp;

public class Janitor extends Employee{
    public Janitor(int id, String firstName, String lastName, char gender, int age, String jobTitle, int experience, double bankAccount) {
        super(id, firstName, lastName, gender, age, jobTitle, experience, 0);
    }

    static {
        setBasicSalary(15000);
    }

    @Override
    public String toString() {
        return "Janitor:\n" +
                "name: " + getFirstName() +
                ", last name: "  + getLastName() +
                ", gender: '" + getGender() + '\'' +
                ", experience: "  + getExperience() +
                ", salary: " + getFinalSalary() +
                ", bank account has: ₽ " + getBankAccount()
                ;
    }
}
