/**
 * Write a description of class MonsterFactory here.
 * 
 * @author Jue Chemparathy
 * @version 1.0
 */
public class MonsterFactory extends CharacterCreator  
{

    public Character getCharacter( CharacterType monsterType ) {
        
        Monster monster = null;
        switch( monsterType ) {
            case Monster1:
                monster = new Monster( "M1", "monster1.png");
                break;
            case Monster2:
                monster = new Monster( "M2", "monster2.png");
                break;
            case Monster3:
                monster = new Monster( "M3", "monster3.png");
                break;
        }
        return monster;
    }
    
}
