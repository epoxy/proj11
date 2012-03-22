package se.chalmers.projectBomberMan;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class StartBomberMan extends StateBasedGame {

	public static final int GAMEPLAYSTATE = 1;

	public StartBomberMan() {
		super("BombSquad");
		this.addState(new GamePlayState(GAMEPLAYSTATE));
		this.enterState(GAMEPLAYSTATE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initStatesList(GameContainer container) throws SlickException {
		this.getState(GAMEPLAYSTATE).init(container, this);
	}

	public static void main(String[] args) throws SlickException {
		AppGameContainer app = new AppGameContainer(new StartBomberMan());
		app.setTitle("BombSquad");
		app.start();
	}

}
