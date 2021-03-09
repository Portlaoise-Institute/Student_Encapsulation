package com.mycompany.student;

public class Student {
    
    //instance variables - studentId, name, etc.
    private int age; //more restrictive access modifier
    
    //Constructors - overload constructor
    
    //Setter and Getter Methods - public interface 
    public void setAge(int age)
    {
        //validate the age
        if ((age<0) || (age>110))
        {
            this.age = 12; //default value
        }
        else {
            this.age = age;  //go ahead set age
        }
    } //end setAge
    
    public int getAge() 
    {
        return this.age;
    }
    
    //Methods
    //ToString Method
    
} //end class
