
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Triangle roof2;
    private Circle sun;
    private Square ground;
    private Square sky;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        sky = new Square();
        sky.changeColor("blue");
        sky.moveVertical(-200);
        sky.changeSize(400);
        sky.makeVisible();
        
        wall = new Square();
        wall.moveVertical(100);
        wall.moveHorizontal(100);
        wall.changeSize(100);
        wall.makeVisible();
        
        ground = new Square();
        ground.changeColor("green");
        ground.moveVertical(200);
        ground.changeSize(300);
        ground.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(110);
        window.moveVertical(120);
        window.makeVisible();

        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(75, 50);
        roof.moveHorizontal(125);
        roof.moveVertical(25);
        roof.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeSize(75, 50);
        roof2.moveHorizontal(175);
        roof2.moveVertical(25);
        roof2.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(220);
        sun.moveVertical(30);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
