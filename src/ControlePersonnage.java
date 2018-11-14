import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControlePersonnage implements KeyListener
{
    public void KeyPressed(KeyEvent e)
    {
        int y = Main.panel.getJoueurY();

        if (e.getKeyCode() == KeyEvent.VK_UP)
        {
            y -= 10;
            Main.panel.se
        }

    }

    public void KeyReleased(KeyEvent arg0)
    {

    }
    public void KeyTyped(KeyEvent arg0)
    {

    }
}
