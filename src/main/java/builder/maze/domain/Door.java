package builder.maze.domain;

public class Door extends MapSite {

	private Room roomFrom;
	private Room roomTo;
	private boolean isOpen;
	
	public Door(Room roomFrom, Room roomTo) {
		this.roomFrom = roomFrom;
		this.roomTo = roomTo;
	}

	@Override
	public void print() {
		System.out.println("Door from room :" + roomFrom.getRoomNumber() + " to room : " + roomTo.getRoomNumber() + " door is open :" + isOpen);
		
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}

	public Room otherSideFrom(Room room) {
		if (room.equals(roomFrom)) {
			return roomTo;
		} else if (room.equals(roomTo)) {
			return roomFrom;
		} else {
			return room;
		}
	}
	
	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

}
