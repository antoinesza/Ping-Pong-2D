import javax.swing.JFrame;

public class Main
{
    public static ObjetsJeu panel = new ObjetsJeu();

    public static void main(String[] args)
    {
        JFrame fenetre = new JFrame();

        fenetre.setTitle("Ping Pong 2D AntoineSza");
        fenetre.setSize(800, 600);
        fenetre.setResizable(false);
        fenetre.setLocationRelativeTo(null);


        fenetre.setVisible(true);
    }

    public int getJoueurX()
    {
        return JoueurX;
    }

    public int getJoueurY()
    {
        return JoueurY;
    }
}

//https://www.youtube.com/watch?v=zxe7dNoKkHc