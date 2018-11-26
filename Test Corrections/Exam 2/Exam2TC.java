import java.util.ArrayList;
/**
 * Write a description of class Exam2TC here.
 *
 * @author Sophia
 * @version (a version number or a date)
 */
public class Exam2TC
{
    public void Q1(){
        String str1 = "Obama, Barack";
        String str2 = "Barack Hussein Obama";
        
        str1.substring (0,7);
        // returns "Obama, "
        str2.substring (str2.indexOf("H"), str2.indexOf("n"));
        // returns "Hussei"
        str1.substring (str1.indexOf(" ")+1);
        // returns "Barack"
        str2.substring (str2.indexOf("n")+2);
        // returns "Obama"
    }
    
    public void Q2(){
        ArrayList<Integer>nums;
        nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(8);
        int sum = 0;
        for (int i = 0; i < nums.size(); i++){
            sum += nums.get(i);
        }
        System.out.println(sum);
    }
    
    public String someFun(int x){
        // someFun(7)
        if (x <= 12) {
            return "SeeYa";
        }
        else if (x > 5) {
            return "Bye";
        }
        return "SoLong";
        // returns "SeeYa"
    }
    
    public String Q4(){
        String str = "199 Churchill Ave. Woodside CA, 94062";
        return str.substring (str.indexOf("Woodside"), str.indexOf("W")+8);
    }
    
    public void Q5(){
        for (int i = 6; i > 3; i--){
            for (int j = 3; j < i; j++){
                System.out.print("  i = " + i + ", j = " + j);
            }
            System.out.print("\n");
        }
    }
    
    // Free Responce 1
    private boolean isActive;
    public boolean isActive(){
        return this.isActive;
    }
    public void setActive(boolean isActive){
        this.isActive = isActive;
    }
    
    // Free Responce 2
    public String transfrmILike (String str) {
        str = str.trim();
        String lastChar = str.substring(str.length()-1);
        if (lastChar.equals(".")) {
            str = str.substring(0, str.length()-1);
        }
        // int psn = findKeyword (str, "I like", 0);
        String subject = str.substring (7);
        // find subject ^
        ArrayList<String>questions;
        questions = new ArrayList<String>();
        questions.add ("Why do you like ");
        questions.add ("Do you eat ");
        questions.add ("What are ");
        questions.add ("What color are ");
        String question = questions.get((int) (Math.random() *4));
        return question + subject + "?";
    }
}
