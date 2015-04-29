import greenfoot.*;

/**
 * Write a description of class TwoBalloonState here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class TwoBalloonState extends BalloonState
{
    
    Character hero;
    
    public TwoBalloonState(Character hero)
    {
        this.hero = hero;
    }    
    
    //set image relevant to current state and direction on button press
    public void setImage(int character)
    {
       
        switch(character)
        {
            case 1:
                if(hero.currFace.equalsIgnoreCase("left"))
                {
                    hero.setImage("bf100L.png");
                }
                else if(hero.currFace.equalsIgnoreCase("right"))
                {
                    hero.setImage("bf100R.png");
                }   
                break;
            case 0:  
                if(hero.currFace.equalsIgnoreCase("left"))
                {
                    hero.setImage("EnemyL2.png");
                }
                else if(hero.currFace.equalsIgnoreCase("right"))
                {
                    hero.setImage("EnemyR2.png");
                }
                break;
            default: System.out.println("Invalid State");
    }
}
    
    public void burstBalloon(int character)
    {
        Greenfoot.playSound("pop-sound.wav");
     
        switch(character)
        {
            case 1:
                if(hero.currFace.equalsIgnoreCase("left"))
                {
                    hero.setImage("bf100L1.png");
                }
                else if(hero.currFace.equalsIgnoreCase("right"))
                {
                    hero.setImage("bf100R1.png");
                }   
            
                break;
            case 0:  
                if(hero.currFace.equalsIgnoreCase("left"))
                {
                    hero.setImage("EnemyL.png");
                }
                else if(hero.currFace.equalsIgnoreCase("right"))
                {
                    hero.setImage("EnemyR.png");
                }
                //enemy.setState(hero.getOneBalloonState());
                break;
            default: System.out.println("Invalid State");
        }
        
            hero.setState(hero.getOneBalloonState());
    }
    
    public void takeLife()
    {
        
    }
}
