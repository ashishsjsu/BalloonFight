import greenfoot.*;

/**
 * Write a description of class FloatRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FloatRight extends FloatBehaviour
{
  public FloatRight()
    {
        System.out.println("In " + this.getClass().getName() + " constructor");
    }
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //more logic can be added to set new coordinates 
        setNewCoordinates(1, 0);
        String[] newBehavData = {"bfl00R.png", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }   
}
