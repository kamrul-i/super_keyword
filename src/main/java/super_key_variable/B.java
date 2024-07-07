package super_key_variable;

public class B extends A {

    //এখানে ৩টি class use করা হয়েছে।। main class থেকে তাকে call করা হয়েছে।।
    int x = 5;

    void display() {
        //System.out.println(super.x); //super class এর instance variable কে call করা হয়েছে,
        System.out.println(x);
    }

    /*
    এখানে, 
    A হলো super class / parent class / base class,
    B হলো sub class / child class / derived class.
    
    A class-কে B class extends করেছে।। যে extends করে তাকে sub class বলে, যাকে extends করা হয় তাকে super class বলে।।
    super class-কে extends করলে তার সবকিছু sub class-এ চলে আসে, যদিও দেখা যায় না।। extends করলে sub class থেকে super class-এর সবকিছু control করা যায়।।
    
    java, line by line কাজ করে, তাই এখানে extends করার কারণে A-class এর variable run হওয়ার কথা,
    কিন্তু তবুও B-class এর variable run হবে, 
    A-class এর variable run হওয়ার জন্য [System.out.println(x);] এখানে x এর যায়গায়(super.x) ব্যবহার করতে হবে।।
     */
    
    /*
    "super" keyword মূলত object oriented programming_OOP এর অংশ।।
    
    super keyword এর ব্যবহার:
    super class এর (variable, method, constructor)কে refer করার জন্য super keyword ব্যবহার করা হয়।। 
    
    overriden method-কে call করার জন্য super keyword ব্যবহার করা হয়।।
    method-কে override করা যায়, তবে constructor-কে override করা যায় না।।
    
    super keyword এর সাহায্যে sub class থেকে super class এর constructor-কে call করা হয়।।
     */
}
