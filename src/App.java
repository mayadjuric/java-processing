import processing.core.PApplet;

import java.util.ArrayList;

public class App extends PApplet {
    ArrayList<Rectangle> rectangles = new ArrayList<>();
    public void setup() {
        frameRate(30);
    }

    public void settings() {
        size(500, 500);
    }

    public void draw(){
        background(64);
        rectMode(CENTER);
        rect(mouseX, mouseY, Rectangle.getDefaultWidth(), Rectangle.getDefaultHeight());


        if (mousePressed) {
            rectangles.add(new Rectangle(this, mouseX, mouseY));
        }

        if (keyPressed) {
            if (key == 'l'){
                Rectangle.increaseSize();
            } else if (key == 's'){
                Rectangle.decreaseSize();
            }
        }

        for (Rectangle rectangle : rectangles) {
            rectangle.draw();
        }
    }


    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "App" };
        PApplet.main(appletArgs);
    }
}