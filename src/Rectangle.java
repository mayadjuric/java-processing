import processing.core.PApplet;
import processing.core.PVector;

public class Rectangle extends PApplet {
    PApplet app;
    private static int DEFAULT_WIDTH = 10;
    private static int DEFAULT_HEIGHT = 10;
    static final int DEFAULT_COLOR = 200;
    private int x, y;
    private int width, height;
    public PVector pos = new PVector();

    public Rectangle(PApplet app, int x, int y) {
        this.app = app;

        this.x = x;
        this.y = y;
        this.width = DEFAULT_WIDTH;
        this.height = DEFAULT_HEIGHT;
    }

    public Rectangle(PApplet app, int x, int y, int width, int height) {
        this.app = app;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw() {
        app.stroke(DEFAULT_COLOR);
        app.fill(DEFAULT_COLOR);
        app.rect(this.x, this.y, this.width, this.height);
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
}
