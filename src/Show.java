import java.awt.*;
import java.applet.*;


public class Show extends Applet  {

        public void init() {
            setBackground(Color.white);
    }

    public void paint(Graphics g) {
            g.setColor(Color.blue);
            g.drawString("Gino", 50,60 );
            g.setColor(Color.red);
            g.drawString("Kamperman", 50, 70);
    }
}