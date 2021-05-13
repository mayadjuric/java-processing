# Template for setting up a project with Processing and Java

Instead of working inside the processing IDE, you can use your prefered IDE and have a much better experience.

## Setup

1. Create a new project in your prefered IDE. In this case I'm using IntelliJ IDEA CE.

2. Add the processing core to your project's library
    - Go to `file` -> `project structure`
    - Go to thee library section and add click the `+` button to add a new library. 
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

public class Component {
    private PApplet app;

    public Component(PApplet p, /* ...other params */) {
        /* Component constructor */
        this.p = p;
        // ... other constructor/initialization logic
    }

    public void calculate() {
        /* Do all your calculations/setup here before drawing */
    }

    public void draw() {
        // First, run the calculations/setup
        this.calculate();
        
        // To use processing methods just use the app instance.
        // e.g.
        // p.stroke(...);
        // p.fill(...);
        // p.rect(...);
        // etc.
    }
}

```

## Using the Component in the main App

```Java

/* ... Main App Class */

public void draw(){
    // ... Other draw logic
    
    // Instantiate a new component and pass instance (this) as argument to have access to all processing methods
    Component component = new Component(this);
    component.draw();
    
    // ... Rest of main app draw logic
}

/* ... Rest of Main App Class */
```

###### Note: Ideally you wouldn't instantiate the component inside the draw function, you would have it as a private class attribute or something, but it was shown this way for simplicity. The main idea is that the component does not get drawn until the `.draw()` method is called on that specific component.
