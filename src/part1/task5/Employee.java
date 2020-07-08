package part1.task5;

public class Employee {
    private String name;
    private String middleName;
    private String surname;
    private String age;
    private String email;
    private String telephoneNumber;
    private String position;
    private String salary;

    public Employee(String name, String middleName, String surname, String age, String email,
                    String telephoneNumber, String position, String salary) {
        this.name = name;
        this.middleName = middleName;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.telephoneNumber = telephoneNumber;
        this.position = position;
        this.salary = salary;
    }

    public void information() {
        System.out.println("Name: " + name + "\n" +
                "Middle Name: " + middleName + "\n" +
                "Surname: " + surname + "\n" +
                "Age: " + age + "\n" +
                "Email: " + email + "\n" +
                "Telephone Number: " + telephoneNumber + "\n" +
                "Position: " + position + "\n" +
                "Salary: " + salary);
    }

    public String getAge() {
        return age;
    }
}