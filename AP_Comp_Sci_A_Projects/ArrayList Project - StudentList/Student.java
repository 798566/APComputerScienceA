
/**
 * Write a description of class Student here.
 *
 * @author Sophia Raab
 * @version (a version number or a date)
 */
public class Student
{
    private String firstName;
    private String middleName;
    private String lastName;
    private int studNumber;
    private double gpa;
    
    // setters
    public void setFirstName(String first){
        firstName = first;
    }
    
    public void setMiddleName(String middle){
        middleName = middle;
    }
    
    public void setLastName(String last){
        lastName = last;
    }
    
    public void setStudNumber(int studNumber){
        studNumber = studNumber;
    }
    
    public void setGpa(double GPA){
        gpa = GPA;
    }
    
    // getters 
    public String getName(){
        String fullName = lastName + ", " + firstName + " " + middleName;
        return fullName;
    }
    
    public String getGpa(){
        String gpa = new String(GPA);
        return gpa; // need to fix so has 2 decimal places
    }
    
    public String getStudNumber(){
        String studNumber = new String(studNumber);
        return studNumber;
    }
    
    
    
    String userCommand = new String();

}