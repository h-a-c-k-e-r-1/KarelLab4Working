
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
  
    public void checkSide() {
        turnLeft();
        if (!frontIsClear()) {
           checkForClear();
        }
        else {
            move();
            turnLeft();
            move();
            turnLeft();
            checkForClear();
        }
    }
    
    public void checkForClear() {
        while(!nextToABeeper()) {
        if (!frontIsClear()) {
            turnRight();
            if (!frontIsClear()) {
              turnRight();
            }
            putBeeper();
            move();
            checkSide();
         }
        }
    }
    public void plantBeepers() {
        
            turnLeft();
            checkForClear();
        
    }
   
}

