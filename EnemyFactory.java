/**
 * Write a description of class MonsterFactory here.
 * 
 * @author Jue Chemparathy
 * @version 1.0
 */
public class EnemyFactory extends CharacterCreator  
{

    public Character getCharacter( CharacterType enemyType ) {
        
        Enemy monster = null;
        switch( enemyType ) {
            case Enemy1:
                monster = new Enemy("M1", "EnemyR2.png");
                break;
            case Enemy2:
                monster = new Enemy("M2", "EnemyR2.png");
                break;
            case Enemy3:
                monster = new Enemy("M3", "EnemyR2.png");
                break;
        }
        return monster;
    }
    
}