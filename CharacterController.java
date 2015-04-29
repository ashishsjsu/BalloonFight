/**
 * Write a description of class CharacterController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;
public class CharacterController extends Actor 
{
   private static CharacterController controller;
    EnemyFactory enemyFactory = new EnemyFactory();

    /**
     * Constructor for objects of class MonsterController
     */
    private CharacterController()
    {
    }
    

    public static CharacterController  getInstance(){
     if(controller == null){
         controller = new CharacterController();
     }
    return controller;
    
    }
    
    //This method will recreate the monsters as the hero kills monsters.
    public void act(){
        //System.out.println("Check for a valid monster world");
        // controlls the monsters
        if ( getWorld().getObjects( Enemy.class ).size() < 5 ) {
 //                Need to create monsters at random place or based on some logic
                int hNum = Greenfoot.getRandomNumber(4);
                getWorld().addObject(enemyFactory.getCharacter(CharacterCreator.CharacterType.Enemy1),100+(hNum*100),200);
        }
    }
}
