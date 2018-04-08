package construction.builder.maze;

import static construction.builder.maze.domain.Direction.East;
import static construction.builder.maze.domain.Direction.North;
import static construction.builder.maze.domain.Direction.South;
import static construction.builder.maze.domain.Direction.West;

import construction.builder.maze.domain.Direction;
import construction.builder.maze.domain.Door;
import construction.builder.maze.domain.Maze;
import construction.builder.maze.domain.Room;
import construction.builder.maze.domain.Wall;

public class StandardMazeBuilder extends MazeBuilder {

	private Maze currentMaze;

	public StandardMazeBuilder() {
		super();
		currentMaze = null;
	}

	@Override
	public Maze getCurrentMaze() {
		return currentMaze;
	}

	@Override
	public void buildMaze() {
		currentMaze = new Maze();
	}

	@Override
	public void buildDoor(int roomFrom, int roomTo) {
		Room room1 = currentMaze.roomNo(roomFrom);
		Room room2 = currentMaze.roomNo(roomTo);
		Door door = new Door(room1, room2);
		door.setOpen(true);
		room1.setSide(commonWall(roomFrom, roomTo), door);
		room2.setSide(commonWall(roomTo, roomFrom), door);
	}

	@Override
	public void buildRoom(int roomNo) {
		Room room = new Room(roomNo);
		currentMaze.addRoom(room);
		room.setSide(North, new Wall(North));
		room.setSide(East, new Wall(East));
		room.setSide(South, new Wall(South));
		room.setSide(West, new Wall(West));
	}

	private Direction commonWall(int roomFrom, int roomTo) {
		// simple door generator direction
		int sum = (roomFrom + roomTo) % 4;
		if (sum == 3) {
			if (roomFrom > roomTo) {
				return Direction.West;
			} else {
				return Direction.East;
			}
		} else {
			if (roomFrom < roomTo) {
				return Direction.North;
			} else {
				return Direction.South;
			}
		}
	}
}
