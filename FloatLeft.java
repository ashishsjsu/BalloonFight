import greenfoot.*;

/**
 * Write a description of class FloatLeft here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class FloatLeft extends FloatBehaviour
{
    protected final int defaultSpeed = -3;
        
    public FloatLeft()
    {
        this.vSpeed  = this.defaultSpeed;
    }
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //more logic can be added to set new coordinates 
        setNewCoordinates(vSpeed, 0);
        String[] newBehavData = { "bfl00L.png", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }
    
    public void resetSpeed()
    {
        this.vSpeed = this.defaultSpeed;
    }
}
