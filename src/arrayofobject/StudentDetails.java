/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayofobject;

/**
 *
 * @author Sherry Sharma
 */
public class StudentDetails {
    private String name;
    //PRINCIPLE1: variable must be private:: encapsulation in OOP.
    // this is made private to avoid other classes to directly access the data.
    private int age;
    // methods are always public but variables are always private.
    // to access private variables, we have to use getters and setters.

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     right click...refactor...encapsulate field then setter getter aajane*/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
}

    
}
