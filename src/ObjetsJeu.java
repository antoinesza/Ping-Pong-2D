import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ObjetsJeu extends JPanel
{
    private int joueurX;
    private int joueurY;

    private int ennemiX;
    private int ennemiY;

    public ObjetsJeu()
    {
        joueurX = 10;
        joueurY = 235;

        ennemiX=  744;
        ennemiY=  235;

        this.setFocusable(true);
        this.requestFocusInWindow();
        this.addKeyListener(new ControlePersonnage());
    }

    public void paintComponent(Graphics g)
    {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(Color.RED);
        g.fillRect(joueurX, joueurY, 40, 100);

        g.setColor(Color.GREEN);
        g.fillRect(ennemiX, ennemiY, 40, 100);
    }

    public int getJoueurX()
    {
        return joueurX;
    }

    public int getEnnemiY()
    {
        return joueurY
    }

    public void setJoueurX(int joueurX)
    {

    }
}
