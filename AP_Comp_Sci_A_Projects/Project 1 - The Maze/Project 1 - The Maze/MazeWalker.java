
/**
 * Project 1 - The Maze : MazeWalker
 *
 * @Sophia
 * @830
 */
public class MazeWalker
{
    public static void run(){
        Maze maze = new Maze(3);
        MazeWalker mazeWalker = new MazeWalker();
        mazeWalker.walkMaze(maze, maze.getMazeBot());
    }
    public void walkMaze(Maze maze, MazeBot mazeBot){
        while (mazeBot.didNotReachGoal()){
            mazeBot.turnRight();
            if (mazeBot.canMoveForward()){
                mazeBot.moveForward();
            }
            else {
                mazeBot.turnLeft();
                if (mazeBot.canMoveForward()){
                    mazeBot.moveForward();
                }
                else {
                    mazeBot.turnLeft();
                    mazeBot.turnLeft();
                }
            }
        }
        if (mazeBot.didReachGoal()){
            mazeBot.signalSuccess();
        }
        else {
            mazeBot.signalError();
        }
    }
}