# Template for setting up a project with Processing and Java

Instead of working inside the processing IDE, you can use your prefered IDE and have a much better experience.

## Setup

1. Create a new project in your prefered IDE. In this case I'm using IntelliJ IDEA CE.

2. Go to your library settings and add the processing core as an external library. 
    - On Mac OSX this is located at `/Applications/Processing.app/Contents/Java/Core.jar`

3. Create your main class that extends PApplet (add your import - `import processing.core.PApplet;`)

## Sample App Class

```Java
import processing.core.PApplet;

public class App extends PApplet {
    public void setup() {
        frameRate(30);
    }

    public void settings() {
        size(500, 500);
    }

    public void draw(){
        // Global Draw Logic
        background(64);
        rectMode(CENTER);
        rect(mouseX, mouseY, 5, 5);


        if (mousePressed) {
           // ... example of handling mouse clicks
        }

        if (keyPressed) {
            // example of handling keypresses
            if (key == 'a'){
              // ...
            } else if (key == 'b'){
              // ...
            }
        }
    }

    public static void main(String[] passedArgs) {
        String[] appletArgs = new String[] { "App" };
        PApplet.main(appletArgs);
    }
}
```

## Example Secondary/Component Class

```Java
import processing.core.PApplet;

public class Shape extends PApplet {
    PApplet app;

    public Shape(PApplet app, ...other params) {
        this.app = app;
        // ... other constructor logic
    }

    public void draw() {
        // To use processing methods just use the app instance.
        // e.g.
        // app.stroke(...);
        // app.fill(...);
        // app.rect(...);
    }
}

```
