class Pen{
    String color;
    String type;
}
class Animals{
    String name;
    String age;

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

        Animals man = new Animals();
        man.name = "Musharraf";
        man.age = "14";
        man.printFn();
 
        System.out.println("hello word");
    }
}
