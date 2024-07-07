package super_key_constructor;

public class B extends A {
    //এখানে ৩টি class use করা হয়েছে।। main class থেকে তাকে call করা হয়েছে।।

    B() {
        //super();
        System.out.println("Welcome to B's constructor.");
    }

    /* 
    constructor-কে override করা যায় না, super keyword এর সাহায্যে super class এর constructor-কে call করা হয়।।
        
    আমি চাই,
    A-class & B-class উভয়ের result print হবে,
    super class এর constructor কে call করতে, sub class এর constructor এর মধ্যে super(); টাইপ করতে হয়।।
    super class এর constructor এর মধ্যে কোন parametre থাকলে, super(); এর মধ্যে তা দিতে হবে, পরবর্তী commit-এ বিদ্যমান।।
    তবে তার আগে super class-কে extends করে নিতে হবে।।
    
    super(); এটাকে অবশ্যই সবার উপরে রাখতে হবে।।
     */
}
