import greenfoot.*;

/**
 * Write a description of class NoBalloonState here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class NoBalloonState extends BalloonState
{
    Character hero;
    
    public NoBalloonState(Character hero)
    {
        this.hero = hero;        
    }   
    
    public void setImage(int character)
    {
        hero.setImage("bf100LDead.png");
    }   
 
    public void burstBalloon(int character)
    {
        System.out.println("Not valid operation");
    }
    
    public void takeLife()
    {
        hero.fallFree();
    }
}
