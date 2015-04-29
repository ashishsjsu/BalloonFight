import greenfoot.*;

/**
 * Write a description of class FloatBehaviour here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public abstract class FloatBehaviour extends Actor
{
    public int vSpeed = 1;
    protected int _newX;
    protected int _newY;
    
    public abstract void resetSpeed();
    
    public abstract String[] floatwithBalloon();
    
    protected void setNewCoordinates(int _x, int _y)
    {
        this._newX = _x;
        this._newY = _y;
    }
    
    protected int[] getNewCoordinates()
    {
        int[] coordinates = {_newX, _newY}; 
        return coordinates;
    }
    
    public void setVspeed(int speed)
    {
        this.vSpeed = speed;
    }
    
    public int getVspeed()
    {
        return this.vSpeed;
    }
    
    public void act() 
    {
       
    }    
}
