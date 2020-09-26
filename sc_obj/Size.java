package sc_obj;

/* SC_Object의 크기 */
public final class Size {
    private final int width, length;

    public Size(final int width, final int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() { return width; }
    public int getLength() { return length; }
}