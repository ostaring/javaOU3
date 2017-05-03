package kod;

/**
 * kod.Position class made to handle positions in a 2d environment, a matrix for example.
 */
public class Position {
    private int x;
    private int y;

    /**
     * Sets the position to what ever the user wants it to be.
     * @param x, x-position
     * @param y, y-position
     */
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return the value of X.
     */
    public int getX(){
        return x;
    }

    /**
     *
     * @return the value of Y.
     */
    public int getY(){
        return y;
    }

    /**
     *
     * @return Returns the position to south.
     */
    public Position getPosToSouth(){
        return new Position(x, y + 1);
    }

    /**
     *
     * @return Returns pos to south west.
     */
    public Position getPosToSouthWest(){
        return new Position(x -  1, y + 1);
    }

    /**
     *
     * @return Returns pos to south east.
     */
    public Position getPosToSouthEast(){
        return new Position(x + 1, y + 1);
    }
    /**
     *
     * @return Returns the position to north.
     */
    public Position getPosToNorth(){
        return new Position(x, y - 1);
    }

    /**
     *
     * @return Returns pos to North east.
     */
    public Position getPosToNorthEast(){
        return new Position(x + 1, y - 1);
    }

    /**
     *
     * @return Returns pos to north west,
     */
    public Position getPosToNorthWest(){
        return new Position( x - 1, y - 1);
    }
    /**
     *
     * @return Returns the position to west.
     */
    public Position getPosToWest(){
        return new Position(x - 1, y);
    }

    /**
     * Returns the position to east.
     * @return Returns the position to east.
     */
    public Position getPosToEast(){
        return new Position(x + 1, y);
    }

    /**
     * Method checks if to positions have the same x and y values.
     * @param o pos to be checked.
     * @return true if equal to each other else false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Position position = (Position) o;

        return x == position.x && y == position.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}