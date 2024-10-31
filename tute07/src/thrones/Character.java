package thrones;

import java.util.List;

/**
 * A character in the simple grid game example.
 *
 * @author Robert Clifton-Everest
 *
 */
/*
 * Component interface
 * All concrete components (wrappee) and decorators (wrapper) implement this
 */
public interface Character {

    public int getHealthPoints();

    public int getX();

    public int getY();

    public void setX(int x);

    public void setY(int y);

    /**
     * Cause this character the given amount of damage.
     *
     * @param points
     */
    // * STEP 3: This damage will be called by the concrete component (CharacterBase)
    public void damage(int points);

    /**
     * This character attacks the given victim, causing them damage according to
     * their rules.
     *
     * @param victim
     */
    public abstract void attack(Character victim);

    /**
     * Can this character move by the given amount along the x and y axes.
     *
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public abstract boolean canMove(int dx, int dy);

    /**
     * Attempts to make a move to a square in the game, given all of the characters
     * If it is an invalid move, returns INVALID.
     * If it is a valid move but the square is occupied, attacks the character and returns ATTACK
     * If it is a valid move and the square is free, returns SUCCESS
     */
    // Interfaces can contain default methods when you want to implement a method that has the same implementation across all classes
    // The classes that implement the Character interface do not need to override the method for makeMove() unless they want to change the implementation
    public default MoveResult makeMove(int x, int y, List<Character> characters) {
        if (!canMove(getX() - x, getY() - y)) {
            return MoveResult.INVALID;
        }

        for (Character character : characters) {
            if (character != this && character.getX() == x && character.getY() == y) {
                attack(character);
                return MoveResult.ATTACK;
            }
        }
        
        setX(x);
        setY(y);

        return MoveResult.SUCCESS;
    }
}