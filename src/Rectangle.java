import processing.core.PApplet;
import processing.core.PVector;

public class Rectangle extends PApplet {
    PApplet parent;
    private static int DEFAULT_WIDTH = 10;
    private static int DEFAULT_HEIGHT = 10;
    static final int DEFAULT_COLOR = 200;
    private int x, y;
    private int width, height;
    public PVector pos = new PVector();

    public Rectangle(PApplet parent, int x, int y) {
        this.parent = parent;
//      this.pos.x = x;
//      this.pos.y = y;
//
        this.x = x;
        this.y = y;
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }

    public Rectangle(PApplet parent, int x, int y, int width, int height) {
        this.parent = parent;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        parent.stroke(DEFAULT_COLOR);
        parent.fill(DEFAULT_COLOR);
        parent.rect(this.x, this.y, this.width, this.height);
    }

    public static void increaseSize() {
        DEFAULT_HEIGHT++;
        DEFAULT_WIDTH++;
    }

    public static void decreaseSize() {
        DEFAULT_HEIGHT--;
        DEFAULT_WIDTH--;
    }

    public static int getDefaultWidth() {
        return DEFAULT_WIDTH;
    }

    public static int getDefaultHeight() {
        return DEFAULT_HEIGHT;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
