class Pen{
    String color;
    String type;
}
class Man{
    String name;
    int age;


Man(String name, int age){
    this.name = name;
    this.age = age;
    System.out.println("constructor called");
}

public void PrintInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
}
    public void printFn(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class ClassPractice {
    
    public static void main(String args[] ){
        
        // System.out.println("hello word");
        Pen pen1 = new Pen();
        pen1.color ="black";

        // System.out.println(pen1.color);

        Man man1 = new Man("Musharraf", 21);
        
        // man.name = "Musharraf";
        // man.age = "14";
        // man.printFn();
 
        // System.out.println(man1.name +" and "+ man1.age);
        // System.out.println("hello word");
        System.out.println();

        man1.PrintInfo();

        
    }
}
