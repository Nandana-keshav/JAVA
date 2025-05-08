import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;

public class EventHandlingDemo extends Applet implements MouseListener, MouseMotionListener, KeyListener 
{

  String message = "";
  int mouseX = 0, mouseY = 0;

  public void init() {
    addMouseListener(this);
    addMouseMotionListener(this);
    addKeyListener(this);

    setFocusable(true);

   
    EventFrame frame = new EventFrame("AWT Window Event Demo");
    frame.setSize(400, 300);
    frame.setVisible(true);
  }

  public void paint(Graphics g) {
    g.drawString(message, mouseX, mouseY);
  }

 
  public void mouseClicked(MouseEvent e) {
    message = "Mouse Clicked";
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }

  public void mouseEntered(MouseEvent e) {
    message = "Mouse Entered";
    mouseX = 50;
    mouseY = 50;
    repaint();
  }

  public void mouseExited(MouseEvent e) {
    message = "Mouse Exited";
    mouseX = 50;
    mouseY = 50;
    repaint();
  }

  public void mousePressed(MouseEvent e) {
    message = "Mouse Pressed";
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }

  public void mouseReleased(MouseEvent e) {
    message = "Mouse Released";
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }


  public void mouseDragged(MouseEvent e) {
    message = "Mouse Dragged";
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }

  public void mouseMoved(MouseEvent e) {
    message = "Mouse Moved";
    mouseX = e.getX();
    mouseY = e.getY();
    repaint();
  }


  public void keyTyped(KeyEvent e) {
    message = "Key Typed: " + e.getKeyChar();
    repaint();
  }

  public void keyPressed(KeyEvent e) {
    message = "Key Pressed: " + e.getKeyChar();
    repaint();
  }

  public void keyReleased(KeyEvent e) {
    message = "Key Released: " + e.getKeyChar();
    repaint();
  }
}


class EventFrame extends Frame implements WindowListener 
{
  Label label;

  EventFrame(String title) {
    super(title);
    label = new Label("Window Events Will Be Shown Here");
    add(label);
    addWindowListener(this);
  }

  public void windowOpened(WindowEvent e) {
    label.setText("Window Opened");
  }

  public void windowClosing(WindowEvent e) {
    label.setText("Window Closing");
    dispose();
  }

  public void windowClosed(WindowEvent e) {
    System.out.println("Window Closed");
  }

  public void windowIconified(WindowEvent e) {
    label.setText("Window Minimized");
  }

  public void windowDeiconified(WindowEvent e) {
    label.setText("Window Restored");
  }

  public void windowActivated(WindowEvent e) {
    label.setText("Window Activated");
  }

  public void windowDeactivated(WindowEvent e) {
    label.setText("Window Deactivated");
  }
}
