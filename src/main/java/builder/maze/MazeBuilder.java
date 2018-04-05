package builder.maze;

import builder.maze.domain.Maze;

public abstract class MazeBuilder {
	
	protected MazeBuilder() {
		super();
	}
	
	public abstract void buildMaze() ;
	public abstract Maze getCurrentMaze();
	
	public abstract void buildDoor(int roomFrom, int roomTo);
	public abstract void buildRoom(int roomNo);
}
