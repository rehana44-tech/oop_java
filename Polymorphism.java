class Student1{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Student1 s1=new Student1();
        s1.name="re";
        s1.age=20;
        s1.printInfo(s1.name);
    }
}
