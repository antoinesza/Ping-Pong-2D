import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlePersonnage implements KeyListener
{
    public void KeyPressed(KeyEvent e)
    {
        int y = Main.panel.getJoueurY();

        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            if (y > 2)
            {
                y -= 10;
                Main.panel.setJoueurY(y);
                Main.panel.repaint();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            y += 10;
            Main.panel.setJoueurY(y);
            Main.panel.repaint();
        }
    }

    public void KeyReleased(KeyEvent arg0)
    {

    }

    public void KeyTyped(KeyEvent arg0)
    {

    }
}
