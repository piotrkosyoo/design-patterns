package builder.maze.domain;

import java.util.HashMap;
import java.util.Map;

public class Room extends MapSite {
	
	private int roomNumber;
	
	private Map<Direction, MapSite> map;

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		this.map = new HashMap<>();
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}
	
	public void setSide(Direction direction, MapSite mapSite) {
		map.put(direction, mapSite);
	}
	
	public MapSite getSide(Direction direction) {
		return map.get(direction);
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

	public void print() {
		map.forEach((k, v) -> v.print());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		if (roomNumber != other.roomNumber)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		result = prime * result + roomNumber;
		return result;
	}
}
