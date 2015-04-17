import greenfoot.*;

/**
 * Write a description of class Descend here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class Descend extends FloatBehaviour
{
    int vspeed = 1;
    private static int acc = 0; 
    
    public Descend()
    {
        System.out.println("In " + this.getClass().getName() + " constructor");
        //acc = acc + 2;
    }
    
    public String[] floatwithBalloon()
    {
        String[] behav = new String[3];
        //here Y coordinate determines the speed with which the character falls
        //some logic should be added so that character falls with increasing speed
        setNewCoordinates(0, vspeed + acc); 
        String[] newBehavData = {"", Integer.toString(getNewCoordinates()[0]), Integer.toString(getNewCoordinates()[1]) };
        
        return newBehavData;
    }
}
