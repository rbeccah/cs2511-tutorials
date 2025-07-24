package thrones;

import java.util.List;

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
    public void damage(int points);

    /**
     * This character attacks the given victim, causing them damage according to
     * their rules.
     * 
     * @param victim
     */
    public void attack(Character victim);

    /**
     * Can this character move by the given amount along the x and y axes.
     * 
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    public boolean canMove(int dx, int dy);

    public MoveResult makeMove(int x, int y, List<Character> characters);
}
