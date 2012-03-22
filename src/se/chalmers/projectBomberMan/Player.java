package se.chalmers.projectBomberMan;

public class Player {
	int oldX;
	int oldY;
	int newX;
	int newY;
	public void movePlayerDir(int direction){
		int deltaX;
		int deltaY;
		if(direction==1){
			deltaX =1;
			deltaY=0;
		}
		
		GameTile t = gameBoard.getTile(x+deltaX, y+deltaY);
				t.receivesPlayer(this);
	}
	public void movePlayer(int x, int y){
		newX=x;
		newY=y;
		//player.getTile(newX,newY);
	}
}
