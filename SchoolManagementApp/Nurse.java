package SchoolManagementApp;

public class Nurse extends Employee{
    public Nurse(int id, String firstName, String lastName, char gender, int age, int experience) {
        super(id, firstName, lastName, gender, age, "school nurse", experience, 0);
    }

    static {
        setBasicSalary(20000);
    }

    @Override
    public String toString() {
        return "Nurse:\n" +
                "name: " + getFirstName() +
                ", last name: "  + getLastName() +
                ", gender: '" + getGender() + '\'' +
                ", experience: "  + getExperience() +
                ", salary: " + getFinalSalary() +
                ", bank account has: ₽ " + getBankAccount()
        ;
    }
}
