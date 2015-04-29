import greenfoot.*;

/**
 * Write a description of class Ascend here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ascend extends FloatBehaviour
{
   protected final int defaultAscendSpeed = 2;
   
   public Ascend()
    {
        this.vSpeed = this.defaultAscendSpeed;
    }
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //here Y coordinate determines the speed with which the character falls
        //some logic should be added so that character falls with increasing speed
        setNewCoordinates(0, -this.vSpeed); 
        String[] newBehavData = {"", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }
    
    public void resetSpeed()
    {
        this.vSpeed = this.defaultAscendSpeed;
    }
}
