/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayofobject;

/**
 *
 * @author Sherry Sharma
 */
public class ArrayofObject {
//printing student details.
    
     
     
    public static void main(String[] args) {
        // Array of object means making objects and access them while giving details.
        // name of the class should be the datatype of the array....must be
        Student[] studentlist = new Student[3];
        //array of objects
        
        StudentDetails s1= new StudentDetails();
        StudentDetails s2= new StudentDetails();
        StudentDetails s3= new StudentDetails();
        S1.setName("John");
        S1.setAge(20);
        S1.setName("sherry");
        S1.setAge(18);
        S1.setName("peter");
        S1.setAge(24);
        studentlist[0] = s1;
        studentlist[1] = s2;
        studentlist[2] = s3;
        
    }
    
}
