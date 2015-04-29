import greenfoot.*;
/**
 * Write a description of class Monster here.
 * 
 * @author Jue Chemparathy, Ashish Narkhede
 * @version 1.0
 */
public class Enemy extends Character
{

 
    // Enums and constants.
    private enum Direction {
        NONE,
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    private Direction direction = Direction.DOWN;

   public Enemy( String name, String image){
        super(name, image);
    }
    
    public void act() 
    {
        moveToward(200,0);
        //include monster actions
    }

    /**
     * Attempts to move into a tile. Will be blocked if the tile is occupied
     * by another mob.
     */
    private void enterTile( int x, int y ) {
            setLocation( x, y );
    }


    /**
     * Moves toward the given location.
     *
     * Alternates between horizontal and vertical movement.
     */
    protected void moveToward( int x, int y ) {

        // Check which axis are valid.
        boolean xAxisValid = ( x != getX() );
        boolean yAxisValid = ( y != getY() );

        // If only one axis is valid, move along that axis.
        if ( xAxisValid && !yAxisValid ) {
            moveTowardX( x );
        }
        else if ( !xAxisValid && yAxisValid ) {
            moveTowardY( y );
        }
        // Otherwise, alternate between axis.
        else if ( this.direction == Direction.UP || this.direction == Direction.DOWN ) {
            moveTowardX( x );
        }
        else { // Covers LEFT, RIGHT and NONE.
            moveTowardY( y );
        }
    }

    /**
     * Moves mob along the X Axis toward the given x.
     */
    private void moveTowardX( int x ) {

        int newX = getX();

        if ( x > newX ) {
            newX++;
            this.direction = Direction.RIGHT;
        }
        else if ( x < newX ) {
            newX--;
            this.direction = Direction.LEFT;
        }

        enterTile( newX, getY() );
    }

    /**
     * Moves mob along the Y Axis toward the given y.
     */
    private void moveTowardY( int y ) {

        int newY = getY();

        if ( y > newY ) {
            newY++;
            this.direction = Direction.DOWN;
        }
        else if ( y < newY ) {
            newY--;
            this.direction = Direction.UP;
        }

        enterTile( getX(), newY );
    }
}