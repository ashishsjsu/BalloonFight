
/**
 * Write a description of class CharacterCreator here.
 * 
 * @author Jue Chemparathy 
 * @version 1.0
 */
public abstract class CharacterCreator
{
    
        public enum CharacterType {
        Player1,
        Player2,
        Enemy1,
        Enemy2,
        Enemy3
    }

    public abstract Character getCharacter(CharacterType characterType);
    
}