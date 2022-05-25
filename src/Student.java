/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sherry Sharma
 */
public class Student {
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
     */
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
