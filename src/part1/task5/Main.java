package part1.task5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Richard",
                "Leonidovich",
                "Fokin",
                "77",
                "@richard.fokin@gmail.com",
                "+19255297902",
                "Judge",
                "17000$");
        employees[1] = new Employee("Denis",
                "Arsenievich",
                "Suvorov",
                "21",
                "@denis1999@gmail.com",
                "+380635808120",
                "Waiter",
                "2100$");
        employees[2] = new Employee("George",
                "Filippovich",
                "Abashidze",
                "52",
                "@george.abashidze78@gmail.com",
                "+99555716480",
                "Developer",
                "12000$");
        employees[3] = new Employee("Angelina",
                "Vadimovna",
                "Kim",
                "39",
                "@angelina.vadimovna@gmail.com",
                "+8613916821546",
                "Administrator",
                "6000$");
        employees[4] = new Employee("Aida",
                "Svyatoslavovna",
                "Abilova",
                "41",
                "@az.aidaidaida@gmail.com",
                "+994516119065",
                "Cashier",
                "3500$");

        for (int i = 0; i < employees.length; i++) {
            if (Integer.parseInt(employees[i].getAge()) > 40) {
                employees[i].information();
                System.out.println();
            }
        }
    }
}