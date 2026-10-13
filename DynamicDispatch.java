class Employee1 {
    double salary;

    Employee1(double salary) {
        this.salary = salary;
    }

    double calculateBonus() {
        return 0;
    }
}

class Manager extends Employee1 {
    Manager(double salary) {
        super(salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee1 {
    Developer(double salary) {
        super(salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {
        Employee1 e1 = new Manager(50000);
        Employee1 e2 = new Developer(50000);

        System.out.println(e1.calculateBonus());
        System.out.println(e2.calculateBonus());
    }
}