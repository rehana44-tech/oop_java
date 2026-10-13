class Calculator{
    int add(int a,int b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
}
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}
    class Cat extends Animal{
        @Override 
        void sound(){
            System.out.println("Meow");
        }
    }


public class DemoPoly{
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.add(2,3);
        Animal a=new Cat ();
        a.sound();
    }
}