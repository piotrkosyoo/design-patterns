package builder.maze;

import org.junit.Test;


import static builder.maze.domain.Direction.North;
import static builder.maze.domain.Direction.East;
import static builder.maze.domain.Direction.South;
import static builder.maze.domain.Direction.West;

import builder.maze.domain.Door;
import builder.maze.domain.Maze;
import builder.maze.domain.Room;
import builder.maze.domain.Wall;

/**
 * 
 * @author yogibubu
 * Comapre two metods createGameWithBuilder with createGameSimple
 */

public class MazeGameTest {
	
	@Test
	public void createGameWithBuilder() {
		MazeBuilder builder = new StandardMazeBuilder();
		builder.buildMaze();
		for (int i = 1; i < 20; i++) {
			builder.buildRoom(i);
		}
		
		for (int i = 1; i < 19; i++) {
			builder.buildDoor(i, i+ 1);
		}
		
		Maze maze = builder.getCurrentMaze();
		maze.printRooms();
	}
	
	@Test
	public void createGameSimple() {
		Maze maze = new Maze();

		Room r1 = new Room(1);
		Room r2 = new Room(2);
		Room r3 = new Room(3);

		Door door = new Door(r1, r2);
		Door door2 = new Door(r2, r3);
		Door door3 = new Door(r3, r1);
		door.setOpen(true);
		door2.setOpen(true);
		door3.setOpen(true);
		
		maze.addRoom(r1);
		maze.addRoom(r2);
		maze.addRoom(r3);

		r1.setSide(North, new Wall(East));
		r1.setSide(East, door);
		r1.setSide(South, new Wall(South));
		r1.setSide(West, new Wall(West));

		r2.setSide(North, new Wall(North));
		r2.setSide(East, new Wall(East));
		r2.setSide(South, door2);
		r2.setSide(West, door);
		
		r3.setSide(North, door2);
		r3.setSide(East, new Wall(East));
		r3.setSide(South, new Wall(South));
		r3.setSide(West, door3);
		maze.printRooms();
	}
}
