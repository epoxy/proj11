package henke;

import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AppGameContainer;

public class SimpleTest extends BasicGame {

    public SimpleTest() {
        super("SimpleTest");
    }
    
    @Override
    public void init(GameContainer container) throws SlickException {}

    @Override
    public void update(GameContainer container, int delta)
            throws SlickException {}

    @Override
    public void render(GameContainer container, Graphics g)
            throws SlickException {
        g.drawString("Nu funkar det f�r sk�ningen ocks�:)", 100, 300);
    }

    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new SimpleTest());
            app.start();
        } catch (SlickException e) {
            e.printStackTrace();
        }
    }
}