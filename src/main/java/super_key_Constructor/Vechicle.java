package super_key_Constructor;

public class Vechicle {
    //এখানে ৩টি class use করা হয়েছে।। main class থেকে তাকে call করা হয়েছে।।
    
    //it is instance variable.
    String color;
    double weight;
    
    //it is parameterized constructor.
    Vechicle(String c, double w){
        color = c;
        weight = w;
    }
    
    //it is a method.
    void attribute(){
        System.out.println("Jeep's color  : " + color);
        System.out.println("Jeep's weight : " + weight+" kg");
    }
}
