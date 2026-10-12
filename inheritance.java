class Book{
    String title;
    int price;

Book(String title,int price){
    this.title=title;
    this.price=price;
}
void display(){
    System.out.println(title+" costs Rs."+price);
}
}


public class inheritance{
         public static void main(String[] args) {
             Book b1=new Book("Java basics",500);
             Book b2=new Book("psych",679);
             b1.display();
             b2.display();
         } 
}