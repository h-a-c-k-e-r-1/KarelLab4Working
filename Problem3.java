 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
  
    public void checkSide() {
        while (!nextToABeeper()) {
        turnLeft();
        if (frontIsClear()) {
           putBeeper();
           turnRight();
           move();
           checkForClear();
        }
        else {
            checkForClear();
        }
    }
    }
    
    public void checkForClear() {
        while (!nextToABeeper()) {
        if (!frontIsClear()) {
            turnRight();
            if (!frontIsClear()) {
              turnRight();
            }
            move();
            checkSide();
         }
        else {
            checkSide();
        }
    }
    }
    
    public void closeAllWindows() {
        turnLeft();
        move();
        turnRight();
        move();
        turnLeft();
        checkSide();
    }
   
}

