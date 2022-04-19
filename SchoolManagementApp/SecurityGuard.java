package SchoolManagementApp;

public class SecurityGuard extends Employee{
    public SecurityGuard(int id, String firstName, String lastName, char gender, int age, String jobTitle, int experience) {
        super(id, firstName, lastName, gender, age, jobTitle, experience, 0);
    }

    static {
        setBasicSalary(19000);
    }

    @Override
    public String toString() {
        return "SecurityGuard:\n" +
                "name: " + getFirstName() +
                ", last name: "  + getLastName() +
                ", gender: '" + getGender() + '\'' +
                ", experience: "  + getExperience() +
                ", salary: " + getFinalSalary() +
                ", bank account has: ₽ " + getBankAccount()
                ;
    }
}
