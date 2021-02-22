import processing.core.PApplet;

import java.util.ArrayList;

public class App extends PApplet {
    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
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
            rectangles.add(new Rectangle(mouseX,mouseY));
        }

        if (keyPressed) {
            if (key == 'l'){
                Rectangle.increaseSize();
            } else if (key == 's'){
                Rectangle.decreaseSize();
            }
        }

//        rectangles.forEach(rec -> {
//            stroke(Rectangle.DEFAULT_COLOR);
//            fill(Rectangle.DEFAULT_COLOR);
//            rect(rec.x, rec.y, rec.width, rec.height);
//        });

        for (Rectangle rec: rectangles) {
            stroke(Rectangle.DEFAULT_COLOR);
            fill(Rectangle.DEFAULT_COLOR);
            rect(rec.getX(), rec.getY(), rec.getWidth(), rec.getHeight());
        }

    }


    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "App" };
        PApplet.main(appletArgs);
    }
}