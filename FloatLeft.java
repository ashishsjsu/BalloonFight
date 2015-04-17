import greenfoot.*;

/**
 * Write a description of class FloatLeft here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class FloatLeft extends FloatBehaviour
{
    public FloatLeft()
    {
        System.out.println("In " + this.getClass().getName() + " constructor");
    }
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //more logic can be added to set new coordinates 
        setNewCoordinates(-1, 0);
        String[] newBehavData = { "bfl00L.png", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }
}
