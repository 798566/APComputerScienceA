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
    
    String menu = "Type Number Listed Before Action To Impliment... /n 1    add a new student record /n 2    delete a student record /n 3     print a student record to the console /n 4     search for a student by name or student number /n 5     clear all students from list";
    
    public int menuNumber(){ // menuNumber Method - displays menu, gets user inpt, returns userCommand
        System.out.println(menu); // prints menu to console for reader
        
        Scanner s = new Scanner (System.in); // get user input - create scanner
        // get user input - create scanner: move along
        // get user input
        int userCommand = s.nextInt(); // assign user input to caller userCommand
        
    }
    
    // select appropriate StudList method according to user command or end program
    public Student Run(){
        
        if (userCommand == "1"){ // add a student to the list
            studentList.addStudentToList();
        }
        else if (userCommand == "2"){ // delete a student record
            studentList.deleteStudentFromList();
        }
        else if (userCommand == "3"){ // print a student record to the console
            studentList.printList();
        }
        else if (userCommand == "4"){ // search for a student by name or student number
            studentList.searchForStudent();
        }
        else if (userCommand == "5"){ // clear all students from the list
            studentList.clearList();
        }
        else{ // end program
            System.out.println("ERROR - please use one of the above commands");
        }
    }
    
    
}
