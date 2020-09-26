package sc_obj;

/* SC_Object의 위치 값 */
public final class Position {
    private int x, y;

    public Position(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(final int x) { this.x = x; }
    public void setY(final int y) { this.y = y; }
}