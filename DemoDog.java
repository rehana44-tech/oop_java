class Animal{
    String name;
    Animal(String name){
        this.name=name;
    }
    public void eat(){
        System.out.println(name+" eats");
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
    }
    public void bark(){
        System.out.println(name+" barks");
    }
}


public class DemoDog{
    public static void main(String[] args) {
        Dog a=new Dog("Ralph");
        a.eat();
        a.bark();
    }

}