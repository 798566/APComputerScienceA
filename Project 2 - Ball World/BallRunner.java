
/**
 * Project 2 Ball World
 *
 * @Sophia
 * @919
 */
public class BallRunner
{
    public static void activity1(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint tgPoint = new TGPoint (0,0);
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 0.0, 25);
        while (true) {
            if (ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }
            else {
                ballBot.setHeading(ballBot.getHeading() + 125);
            }
        }
    }
    
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        int ballArray = ballBotArray.length;
        for (int i = 0; i < ballBotArray.length; i++) {
            if (ballBotArray[i] == null) {
                ballArray = i;
            }
            return ballArray;
        }
        return ballBotArray.length;
    }
    
    public static void activity2(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint tgPoint = new TGPoint (0,0);
        BallBot[] ballBotArray= new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while (true) {
            if (ballRunner.findFreeBallBotIndex(ballBotArray) < ballBotArray.length) {
                    BallBot ballBot = new BallBot(ballWorld, tgPoint, (int) Math.random() * 360, (int) Math.random() * 100);
            }
            for (int index = 0; index < ballBotArray.length; index++) {
                if (ballBotArray[index] != null) {
                    while (true){
                        if (ballBotArray[index].canMoveForward(ballWorld) == true){
                            ballBotArray[index].moveForward();
                         }
                        else {
                            ballBotArray[index].setHeading(ballBotArray[index].getHeading() + (int) Math.random()* 360);
                        }
                    }
                }
                // else {
                    // return ballBotArray.length;
                // }
            }
        }
    }
}