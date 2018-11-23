
/**
 * Project 2 Ball World
 *
 * @Sophia
 * @919
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint tgPoint = new TGPoint (0,0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 0.0, 25);
        if (ballBot.canMoveForward(ballWorld)){
           ballBot.moveForward();
        }
        else {
            ballBot.getHeading();
            ballBot.setHeading(newHeading);
        }
    }
}