
/**
 * @author Sophia 
 * @version (11 26 18)
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private int x;
    private Cell[] neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell(int a)    {
        x = a;
        neighbors = new Cell[4];// North, East, South, and West only 
    }

    /**
     * ++++++++++++++  methods
     */
    
    public int getInt(){
        return x;
    }
    
    public Cell[] getNeighbors(){
        return neighbors;
    }
    
    public void setNeighbors(Cell[] pneighbors){
        for(int i = 0; i < pneighbors.length; i++ ){
            neighbors[i] = pneighbors[i];
        }
    }
}
