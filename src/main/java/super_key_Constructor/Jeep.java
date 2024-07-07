package super_key_Constructor;

public class Jeep extends Vechicle {
    //এখানে ৩টি class use করা হয়েছে।। main class থেকে তাকে call করা হয়েছে।।

    int whole;

    Jeep(String c, double w, int b) {
        color = c;  //এই error পরবর্তী commit-এ সমাধান হবে।।
        weight = w;
        whole = b;
    }

    @Override
    void attribute() {
        System.out.println("Jeep's color  : " + color);
        System.out.println("Jeep's weight : " + weight + " kg");
        System.out.println("Jeep's whole  : " + whole);
    }

    /* 
    constructor-কে override করা যায় না, super keyword এর সাহায্যে super class এর constructor-কে call করা হয়।।
        
    আমি চাই,
    A-class & B-class উভয়ের result print হবে,
    super class এর constructor কে call করতে, sub class এর constructor এর মধ্যে super(); টাইপ করতে হয়, তবে
    super class এর constructor এর মধ্যে কোন parametre থাকলে, super(); এর মধ্যে তা দিতে হবে, যেমন-[super(c, w);]
    অবশ্যই super class-কে extends করে নিতে হবে।।
    
    super(c, w); এটাকে অবশ্যই সবার উপরে রাখতে হবে।।
     */
}
