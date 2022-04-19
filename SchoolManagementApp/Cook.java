package SchoolManagementApp;

import java.util.ArrayList;
import java.util.Arrays;

public class Cook extends Employee{

    public Cook(int id, String firstName, String lastName, char gender, int age,  int experience) {
        super(id, firstName, lastName, gender, age, "Cook", experience, 0);
    }

    static {
        setBasicSalary(17000);
    }

    ArrayList<Cook> cooks = new ArrayList<>();
/*
    public void addCook(Cook cook){
        cooks.add(cook);
    }

    public void addCooks(Cook[] cooks){
        this.cooks.addAll(Arrays.asList(cooks));
    }

 */

    public static String searchById(ArrayList<Cook>cooks, int id){
        String result = "Invalid id provided, check id and try again";
        for (int i = 0; i < cooks.size(); i++) {
            if (cooks.get(i).getId() == id){
                result = "Cook found: \nname: '" + cooks.get(i).getFirstName() + " "  + cooks.get(i).getLastName() + "' " + cooks.get(i).getFinalSalary();
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Cook:\n" +
                "[ id " + getId() +
                ", first name: '" + getFirstName() + '\'' +
                ", last name: '" + getLastName() + '\'' +
                ", age: '" + getAge() + '\'' +
                ", gender: '" + getGender() + '\''+
                ", job title: " + getJobTitle() +
                ", experience: " + getExperience() +
                ", basic salary: " + getBasicSalary() +
                ", \nbonus according to experience: " + getBonus()+
                ", final salary: " + getFinalSalary()+
                ", bank account has: ₽ " + getBankAccount() +
                " ]\n";
    }
}
