package construction.builder.maze.domain;

import java.util.ArrayList;
import java.util.List;

public class Maze {

	private List<Room> rooms;
	private int currentIndex;

	public Maze() {
		this.currentIndex = 0;
		this.rooms = new ArrayList<>();
	}

	public void addRoom(Room room) {
		rooms.add(room);
		currentIndex++;
	}

	public Room roomNo(int roomNo) {
		return rooms.get(roomNo - 1);
	}

	public void printRooms() {
		for (Room room : rooms) {
			System.out.println("Print room " +  room.getRoomNumber());
			room.print();
			System.out.println("");
		}
	}

}
