import greenfoot.*;

/**
 * Write a description of class OneBalloonState here.
 * 
 * @author Ashish Narkhede
 * @version 1.0
 */
public class OneBalloonState extends BalloonState
{
    Character hero;
    
    public OneBalloonState(Character hero)
    {
        this.hero = hero;
    }
    
    public void setImage(int character)
    {
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

                break;
            default: System.out.println("Invalid State");
        }
         hero.setState(hero.getOneBalloonState());
    }
    
    public void burstBalloon(int character)
    {
        if(character == 1)
        {
             hero.setImage("bf100LDead.png");
        }
        else if(character == 0)
        {
            hero.setImage("deadEnemy.png");
        }
        Greenfoot.playSound("pop-sound.wav");
        hero.setState(hero.getNoBalloonState()); 
    }
    
    public void takeLife()
    {
        
    }
}
