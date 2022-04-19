package SchoolManagementApp;

public class Person {

    private int id;
    private String firstName, lastName;
    private char gender;
    private int age;

    public Person(int id, String firstName, String lastName, char gender, int age) {
        this.id = id;
        setFirstName( firstName );
        setLastName( lastName );
        setGender( gender );
        setAge( age );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        // Проверка, не пустое ли имя, например: ""
        if (firstName.isBlank() || firstName.isEmpty()){
            System.err.println("First name cannot be empty or blank: '" + firstName + '\'');
            System.exit(1);
        }

        // Проверка на отсутствие символов и цифр в имени, например: Иван2 или Ив@н не допустимы
        for (int i = 0; i < firstName.length(); i++) {
            if (!Character.isAlphabetic(firstName.charAt(i))){

                // Проверка на содержание пробелов, пробелы допускается, например "Абу Али"
                if (firstName.charAt(i) == ' '){
                    continue;
                }
                System.err.println("First name must contain only letters: '" + firstName + '\'');
                System.exit(1);
            }
        }

        this.firstName = firstName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {

        // Проверка, не пустая ли фамилия, например: ""
        if (lastName.isEmpty() || lastName.isBlank()){
            System.err.println("Last name cannot be empty or blank: '" + lastName + '\'');
            System.exit(1);
        }

        // Проверка на отсутствие символов и цифр в имени, например: Иванов2 или Ив@нов не допустимы
        for (int i = 0; i < lastName.length(); i++) {
            if (!Character.isAlphabetic(lastName.charAt(i))){
                // Проверка на содержание пробелов, пробелы допускается, например "Мемет оглы"
                if (lastName.charAt(i) == ' '){
                    continue;
                }
                System.err.println("Last name must contain letters only: '" + lastName + '\'');
                System.exit(1);
            }
        }

        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F')){
            System.err.println("Gender can not be set other than 'M' or 'F', you value is: '" + gender + '\'');
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.err.println("Invalid age provided: " + age);
        }
        this.age = age;
    }



    @Override
    public String toString() {
        return "Person:\n" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '\n';
    }
}
