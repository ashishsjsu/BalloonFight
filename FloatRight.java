import greenfoot.*;

/**
 * Write a description of class FloatRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FloatRight extends FloatBehaviour
{
  protected final int defaultSpeed = 3;
  
  public FloatRight()
    {
        this.vSpeed = this.defaultSpeed;
    }
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //more logic can be added to set new coordinates 
        setNewCoordinates(vSpeed, 0);
        String[] newBehavData = {"bfl00R.png", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }   
    
    public void resetSpeed()
    {
        this.vSpeed = this.defaultSpeed;
    }
}
