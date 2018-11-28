
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
                if (cells [r][c].getInt() != 10 ){System.out.print (" ");};  //for formatting
                System.out.print(cells [r][c].getInt() + " ");
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

    /*
     * Load neighbor cells into the neighbors array
     * Preconditions: matrix must be at lease 2x2
     */
    public void loadNeighbors(){
        for (int r = 0; r < cells.length; r++){
            for ( int c = 0; c < cells[r].length; c++){
                //System.out.println("" + r + " " + c + " cells[r].length = " + cells[r].length );
                // CORNERS with 2 neighbors each
                if (cells[r][c] == cells[0][0]){ // top left corner
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c + 1]}; // down one, right one
                    cells[r][c].setNeighbors(neighbors);
                }
                else if (cells[r][c] == cells[0][cells[r].length -1]){ // top right corner
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c -1]}; // down one, left one
                    cells[r][c].setNeighbors(neighbors);
                }
                else if (cells[r][c] == cells[cells.length -1][cells[r].length -1]){ // bottom right corner
                    Cell[] neighbors = {cells[r -1][c], cells[r][c -1]}; // up one, left one
                    cells[r][c].setNeighbors(neighbors);
                }
                else if (cells[r][c] == cells[cells.length -1][0]){ // bottom left corner
                    Cell[] neighbors = {cells[r - 1][c], cells[r][c +1]};
                    cells[r][c].setNeighbors(neighbors);
                }
                // EXTERIOR ROWS/COLUMN with 3 neighbors each
                else if (r == 0){ // top row
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c + 1], cells[r][c - 1]}; // down one, right one, left one
                    cells[r][c].setNeighbors(neighbors);
                }
                else if (r == cells.length - 1){ // bottom row
                    Cell[] neighbors = {cells[r - 1][c], cells[r][c + 1], cells[r][c - 1]}; // up one, right one, left one
                    cells[r][c].setNeighbors(neighbors);
                }
                else if (c == 0){ // left column
                    Cell[] neighbors = {cells[r][c + 1], cells[r - 1][c], cells[r + 1][c]}; // right one, up one, down one
                    cells[r][c].setNeighbors(neighbors);
                }
                else if (c == cells[r].length - 1){ // right column
                    Cell[] neighbors = {cells[r + 1][c], cells[r - 1][c], cells[r][c - 1]}; // down one, up one, left one
                    cells[r][c].setNeighbors(neighbors);
                }
                // INTERIOR with all 4 neighbors
                else {
                    Cell[] neighbors = {cells[r + 1][c], cells[r][c + 1], cells[r - 1][c], cells[r][c - 1]};
                    cells[r][c].setNeighbors(neighbors);
                }
            }
        }
    }
    
    
    
    //  Find's the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int greatest = 0;
        for (int r = 0; r < cells.length; r++){
            for ( int c = 0; c < cells[r].length; c++){
                Cell[] ca = cells[r][c].getNeighbors();
                int sum = 0;
                for (int i = 0; i < ca.length; i++){
                    if ( ca[i] != null ){
                        sum += ca[i].getInt();
                        if (sum > greatest) {
                            greatest = sum;
                        }
                    }
                }
            }
        }
        return greatest;
    }
}
