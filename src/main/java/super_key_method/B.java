package super_key_method;

public class B extends A {
    
    @Override
    void display(){
        super.display(); //super class এর method কে call করা হয়েছে,
        message();       //super class এর method কে call করা হয়েছে,
        System.out.println("welcome to B class.");
    }
    /*
    super class এর method-কে sub class এ use করাকে overriden method বলে।।
    যে method-কে override করা হবে, তার নাম উভয় class-এ ‍same হতে হবে।।
    এই method-কে overriden করে নিতে হয়, 
    তবে তার আগে super class-কে extends করে নিতে হবে।।
    
    আমি চাই,
    A-class & B-class উভয়ের result print হবে।।
    super class এর override method কে call করতে, sub class এর method এর মধ্যে ‍super.(method name)ব্যবহার করতে হয়, যেমন-[super.display();]
    super class এর non-override method কে call করতে, sub class এর method এর মধ্যে ‍(method name) ব্যবহার করতে হয়, যেমন-[message();]    
     */
}
