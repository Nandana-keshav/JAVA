import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class HouseApplet extends Applet implements MouseListener {
  Color doorColor = Color.blue;

  public void init() {
    addMouseListener(this);
  }

  public void paint(Graphics g) {
    
    setBackground(Color.cyan);

  
    g.setColor(Color.orange);
    
    
    g.fillRect(150, 200, 200, 200);
    
    g.setColor(Color.black);
    int x[] = { 140, 250, 360 }; 
    int y[] = { 200, 100, 200 };
    g.fillPolygon(x, y, 3);

    
    g.setColor(doorColor);
    g.fillRect(225, 300, 50, 100);

    
    g.setColor(Color.white);
    g.fillRect(170, 230, 40, 40);
    g.fillRect(290, 230, 40, 40);
  }

 
  public void mouseClicked(MouseEvent e) {
  	if(doorColor == Color.blue){
    doorColor = Color.red;
     }else if(doorColor==Color.red){
     doorColor=Color.green;
     }
    repaint(); 
  }

  public void mousePressed(MouseEvent e) {
  }

  public void mouseReleased(MouseEvent e) {
  }

  public void mouseEntered(MouseEvent e) {
  }

  public void mouseExited(MouseEvent e) {
  }
}
