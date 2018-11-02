
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    String menu = "Type Number Listed Before Action To Impliment... /n 1    add a new student record /n 2    delete a student record /n 3     print a student record to the console /n 4     search for a student by name or student number /n 5     clear all students from list";
    
    
    String firstName;
    String middleName;
    String lastName;
    int studNUmber;
    double gpa;
    
    String fullName = lastName + ", " + firstName + " " + middleName;
    
    String userCommand = new String();
}
