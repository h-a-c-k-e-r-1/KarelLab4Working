
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
       
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void findEdge() {
        if (frontIsClear()) {
            move();
            if (frontIsClear()) {
            move();
            if (frontIsClear()) {
            move();
            
        }
        }
        }
        
    }
    
    public void checkSide() {
        turnRight();
        if (!frontIsClear()) {
           checkForClear();
        }
        }
    
    public void checkForClear() {
        if (!frontIsClear()) {
            turnLeft();
            if (!frontIsClear()) {
                turnLeft();
            }
            move();
            checkSide();
         }

        }
        
    public void escapeRoom() {
        findEdge();
        checkForClear();
        move();
        turnOff();
    }
   
}

