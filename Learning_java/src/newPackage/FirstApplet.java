package newPackage;
import java.applet.*;
import java.awt.*;
/*
<applet code = "FirstApplet" width="400", height="350"></applet>
 */
public class FirstApplet extends Applet
{
    int count = 1;
    public void init()
    {
        System.out.println("init : "+ count++);
    }
    public void start()
    {
        System.out.println("start : "+ count++);
    }
    public void stop()
    {
        System.out.println("stop : "+ count++);
    }
    public void destroy()
    {
        System.out.println("destroy : "+ count++);
    }
    public void paint(Graphics g)
    {
        System.out.println("paint : "+ count++);
        g.drawString("first applet life cycle",150,200);
    }
}
