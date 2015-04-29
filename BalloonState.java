import greenfoot.*;

/**
 * Write a description of class BalloonState here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public abstract class BalloonState
{
    public abstract void setImage(int character);
    public abstract void burstBalloon(int character);
    public abstract void takeLife();
}
