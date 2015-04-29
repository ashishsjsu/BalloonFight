import greenfoot.*;

/**
 * Write a description of class Descend here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class Descend extends FloatBehaviour
{
    protected final int defaultDescendSpeed = 1;
    
    public Descend()
    {
        this.vSpeed = this.defaultDescendSpeed;
    };
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //here Y coordinate determines the speed with which the character falls
        //some logic should be added so that character falls with increasing speed
        setNewCoordinates(0, this.vSpeed); 
        String[] newBehavData = {"", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }
    
    public void resetSpeed(){
        this.vSpeed = this.defaultDescendSpeed;
    }
    
}
