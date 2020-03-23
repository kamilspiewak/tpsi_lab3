/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi_lab3;

/**
 *
 * @author Student
 */
public class Teacher extends Person
{
    String courseName;
    public Teacher(String firstName, String lastName, String courseName)
    {
        super(firstName, lastName);
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    
}
