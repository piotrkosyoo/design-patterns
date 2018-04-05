package builder.maze.domain;

public class Wall extends MapSite {
	
	private Direction direction;
	
	public Wall(Direction direction) {
		this.direction = direction;
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}

	@Override
	public void print() {
		System.out.println("Wall direction:" + direction.toString());
	}
	
	
}
