
/**
 * lab 1106 - 2D Arrays
 *
 * @author Sophia
 * @version 1106
 */
public class GridTester
{
    int[][] grid = new int[10][10]; // creates 10 by 10 2D array
    public void loadArray(){ // loads the array with random ints between 1 and 100 incllusive
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[r].length; c++){
                grid[r][c] = (int) (Math.random() * 100) + 1;
            }
        }
    }
    
    public int sumAll(){ // finds and returns the sum of all the values in the Array
        int sum = 0;
        for (int i = 0; i <= grid.length; i++){
            sum += i;
        }
        return sum;
    }
    
    public int findGreatest(){ // finds and returns the greatest value in the grid
        int greatest = 0;
        for (int i = 0; i < grid.length; i++){
            fo
            if (grid[i] > greatest){
                greatest = grid[i];
            }
        }
        return greatest;
    }
    
    public int numberOfGreatest(){
        int greatest = findGreatest(grid);
        int numberOfGreatest = 0;
        for (int i = 0; i < grid.length; i++){
            if (grid[i] == greatest){
            
            }
        }
        
        return numberOfGreatest;
    }
    
    public double findAvg(){
        double average = 0;
        
        return average;
    }
}