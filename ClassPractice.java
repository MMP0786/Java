import java.util.*;
// import bank;

class Pen {
    String color;
    String type;
}

class Man {
    String name;
    int age;

    // polymorphism
    public void printInformation(String name){
        System.out.println(name);
    }
    public void printInformation(String name, int age){
        System.out.println(name + " "+ age) ;
    }
    public void printInformation(int age){
        System.out.println(age);
    }
    Man(String name, int age) {
        this.name = name;
        this.age = age;
        // System.out.println("constructor called");
    }

    Man(Man man2) {
        this.name = man2.name;
        this.age = man2.age;
    }

    
    public void printFn() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Man(){
        
    }
}

class Female extends Man{
    String name;
    int age;
    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

}

public class ClassPractice {

    public static void main(String args[]) {

        // System.out.println("hello word");
        Pen pen1 = new Pen();
        pen1.color = "black";

        Man man1 = new Man("Musharraf", 22);
        Man man2 = new Man(man1);
        Man man3 = new Man();

        // System.out.println(pen1.color);
        // System.out.println(man2);
        // man.name = "Musharraf";
        // man.age = "14";
        // man.printFn();

        // System.out.println(man1.name +" and "+ man1.age);
        // System.out.println("hello word");

        System.out.println();
        // man2.PrintInfo();

        // man3.printInformation("musharraf");
        man3.printInformation( 22);

        Female female1 = new Female();

        female1.printFn();
        female1.printInformation("Gul", 22);

        // bank.Account =new bank.Account()
    }
}
