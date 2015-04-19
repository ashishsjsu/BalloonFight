/**
 * Write a description of class MonsterController here.
 * 
 * @author Jue Chemparathy 
 * @version 1.0
 */
import greenfoot.*;
public class MonsterController extends Actor
{
    private static MonsterController controller;
    MonsterFactory monsterFactory = new MonsterFactory();

    /**
     * Constructor for objects of class MonsterController
     */
    private MonsterController()
    {
    }
    

    public static MonsterController  getInstance(){
     if(controller == null){
         controller = new MonsterController();
     }
    return controller;
    
    }
    
    //This method will recreate the monsters as the hero kills monsters.
    public void act(){
        //System.out.println("Check for a valid monster world");
        // controlls the monsters
        MonsterFactory monsterFactory = new MonsterFactory();
        if ( getWorld().getObjects( Monster.class ).size() < 5 ) {
            if ( Greenfoot.getRandomNumber( 10 ) == 0 ) {    
 //                Need to create monsters at random place or based on some logic            
//                getWorld().addObject(monsterFactory.getCharacter(CharacterCreator.CharacterType.Monster1),400,200);
            }
        }
    }
    }

