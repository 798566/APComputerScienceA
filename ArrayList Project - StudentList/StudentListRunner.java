import java.util.Scanner;
/**
 * ArrayList Project - StudentList
 *
 * @Sophia
 * @1025
 */
public class StudentListRunner
{
    StudentList studentList = new StudentList(); // instatiate StudentList object
    
    public int menuNumber(){ // menuNumber Method - displays menu, gets user inpt, returns userCommand
        System.out.println(menu); // prints menu to console for reader
        
        Scanner s = new Scanner (System.in); // get user input - create scanner
        s.nextLine(); // get user input - create scanner: move along
        // get user input
        int userCommand; 
        
        return userCommand; // returns int of user command
    }
    
    // select appropriate StudList method according to user command or end program
    public static void main(){
        studentList.addStudentToList();
        studentList.deleteStudentFromList();
        studentList.editStudentList();
        studentList.clearList();
        studentList.printAll();
        studentList.printStudent();
        
        if(userCommand != 0){ // select appropriate action
            
        }
        else{ // end program
            
        }
    }
    
    
    
}
