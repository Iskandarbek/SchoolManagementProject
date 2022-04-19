package SchoolManagementApp;

public class Employee extends Person{

    private String jobTitle;
    private static double basicSalary;
    private double finalSalary;
    private double bonus;
    private static double bankAccount;
    private int experience;


    public Employee(int id, String firstName, String lastName, char gender, int age, String jobTitle, int experience, double bankAccount) {
        super(id, firstName, lastName, gender, age);
        setJobTitle( jobTitle );
        setExperience( experience );
        this.bankAccount = bankAccount;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle.isBlank() || jobTitle.isEmpty()){
            System.err.println("Job title cannot be empty or blank: '" + jobTitle + '\'');
            System.exit(1);
        }

        // Проверка на отсутствие символов, цифры допускаются. Например: преподаватель 2 категории
        for (int i = 0; i < jobTitle.length(); i++) {
            if (!Character.isLetterOrDigit(jobTitle.charAt(i))){
                // пробелы допустимы
                if (jobTitle.charAt(i) == ' '){
                    continue;
                }
                System.err.println("Job title may contain only letters and numbers: '" + jobTitle + '\'');
                System.exit(1);
            }
        }
        this.jobTitle = jobTitle;
    }

    public static double  getBasicSalary() {
        return basicSalary;
    }

    public static void setBasicSalary(double basicSalary) {
        if (basicSalary <= 0){
            System.err.println("Invalid basic salary value provided: '" + basicSalary + '\'');
        }
        Employee.basicSalary = basicSalary;
    }

    public double getFinalSalary() {
        if (experience >= 10){
            finalSalary = basicSalary  + (basicSalary * 0.9);
        } else if ( experience >=  6 ) {
            finalSalary = basicSalary  + (basicSalary * 0.6);
        } else if (experience >= 3 ){
            finalSalary = basicSalary  + (basicSalary * 0.3);
        }else{
            finalSalary = basicSalary  + (basicSalary * 0.05);
        }
        return finalSalary;
    }

    public double getBankAccount() {
        return bankAccount;
    }
/*
    public static void printBankAccount() {
        System.out.println("Available sum on bank account is: "  + bankAccount);
    }

 */


    public double getBonus() {
        return getFinalSalary() - basicSalary;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0){
            System.err.println("Invalid experience value provided: '" + experience + '\'');
            System.exit(1);
        }
        this.experience = experience;
    }


}
