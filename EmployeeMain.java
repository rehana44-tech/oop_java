class Employee{
    String name;
    double salary;
    Employee(String name){
        this.name=name;
            this.salary=0;
    }
    Employee(String name,double salary){
        this.name=name;
            this.salary=salary;
}
    void printInfo(){
        System.out.println(name+":"+salary);
        }
}
public class EmployeeMain{
    public static void main(String[] args) {
    Employee e1=new Employee("hana");
    Employee e2=new Employee("rehana",50000);
    e1.printInfo();
    e2.printInfo();
    }
}