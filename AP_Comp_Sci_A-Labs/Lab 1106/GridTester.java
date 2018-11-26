
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
            for (int c = 0; c < grid[0].length; c++){
                grid[r][c] = (int) (Math.random()*100) + 1;
            }
        }
    }

    public int sumAll(){ // finds and returns the sum of all the values in the Array
        int sum = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++){
                sum += grid[r][c];
            }
        }
        return sum;
    }

    public int findGreatest(){ // finds and returns the greatest value in the grid
        int greatest = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] > greatest){
                    greatest = grid[r][c];
                }
            }
        }
        return greatest;
    }

    public int numberOfGreatest(int greatest){ // returns number of times the greatest number occurs in the array
        int numberOfGreatest = 0;
        for (int r = 0; r < grid.length; r++){
            for (int c = 0; c < grid[0].length; c++){
                if (grid[r][c] == greatest){
                    numberOfGreatest += 1;
                }
            }
        }
        return numberOfGreatest;
    }

    public double findAvg(int[][] grid, int sum){ // returns the average of all the numbers in the array
        double average;
        average = (double)(sum)/(grid.length*grid[0].length);
        return average;
    }
}