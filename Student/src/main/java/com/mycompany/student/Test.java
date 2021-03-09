package com.mycompany.student;

public class Test {

    public static void main(String[] args) {
        
        //Create a student object
        Student s1 = new Student();
        
        System.out.println("Age: "+s1.getAge()); //initial age
        
        //Attempt to modify/set the student age
//        s1.age = -500; // bad data value being set
        s1.setAge(-500);
        
        //Output the student age
//        System.out.println("Student Age: "+s1.age);
        System.out.println("Age: "+s1.getAge());
        
    } //end main 
    
} //end class
