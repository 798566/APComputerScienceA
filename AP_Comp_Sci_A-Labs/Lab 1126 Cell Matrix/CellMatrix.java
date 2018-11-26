
/**
 * 
 * CellMatrix
 * @author Sophia 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for (int r = 0; r < cells.length; r++){
            for ( int c = 0; c < cells[r].length; c++){
                System.out.print(cells[r][c]);
            }
            System.out.println();
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for (int r = 0; r < cells.length; r++){
            for ( int c = 0; c < cells[r].length; c++){
                cells[r][c] = new Cell((int)(Math.random()*10 + 1));
            }
        }
    }
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(){
        for (int r = 0; r < cells.length; r++){
            for ( int c = 0; c < cells[r].length; c++){
                // CORNERS with 2 neighbors each
                if (cells[r][c] == cells[0][0]){ // top left corner
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c + 1]}; // down one, right one
                }
                else if (cells[r][c] == cells[0][cells[r].length]){ // top right corner
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c +1], cells[r -1][c], cells[r][c -1]}; // where I left off - fix this line and rest of corners - and the last method
                }
                else if (cells[r][c] == cells[cells.length][cells[r].length]){ // bottom right corner
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c +1], cells[r -1][c], cells[r][c -1]};
                }
                else if (cells[r][c] == cells[cells.length][0]){ // top right corner
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c +1], cells[r -1][c], cells[r][c -1]};
                }
                // EXTERIOR ROWS/COLUMN with 3 neighbors each
                else if (r == 0){ // top row
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c + 1], cells[r][c - 1]}; // down one, right one, left one
                }
                else if (r == cells.length){ // bottom row
                    Cell[] neighbors = {cells[r - 1][c], cells[r][c + 1], cells[r][c - 1]}; // up one, right one, left one
                }
                else if (c == 0){ // left column
                    Cell[] neighbors = {cells[r][c + 1], cells[r - 1][c], cells[r + 1][c]}; // right one, up one, down one
                }
                else if (c == cells[r].length){ // right column
                    Cell[] neighbors = {cells[r + 1][c], cells[r - 1][c], cells[r][c - 1]}; // down one, up one, left one
                }
                // INTERIOR with all 4 neighbors
                else {
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c +1], cells[r -1][c], cells[r][c -1]};
                }
            }
        }
    }

    //  Find's the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int sum = 0;
        for (int r = 0; r < cells.length; r++){
            for ( int c = 0; c < cells[r].length; c++){
                cells[r][c] neighbors 
                for (int i = 0; i < neighbors[].length; i++){
                    
                }
            }
        }
        int greatest = 0;
        for ( int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r])
        }
        
        
        return greatest;
    }

}
