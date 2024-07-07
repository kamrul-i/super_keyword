package super_key_Constructor;

public class Vechicle {
    //এখানে ৩টি class use করা হয়েছে।। main class থেকে তাকে call করা হয়েছে।।
    
    String color;
    double weight;
    
    Vechicle(String c, double w){
        color = c;
        weight = w;
    }
    
    void attribute(){
        System.out.println("Jeep's color  : " + color);
        System.out.println("Jeep's weight : " + weight+" kg");
    }
}
