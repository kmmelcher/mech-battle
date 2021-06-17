public class Robot {

	public enum Orientation {
		UP, DOWN, LEFT, RIGHT;
	}
	
	private String name;
	private Orientation orientation;
	private boolean needsReload;
	private int x;
	private int y;
	
	public Robot(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.needsReload = false;
		this.orientation = Orientation.UP;
	}
	
	public void spin(Orientation direction) {
		this.orientation = direction;
	}
	
	public void move() {
		
		switch (this.orientation) {
		case UP:
			this.x++;
		case DOWN:
			this.x--;
		case LEFT:
			this.y++;
		case RIGHT:
			this.y--;
		}
	}
	
	public void scan() {
		
	}
	
	public void shoot() {
		
		this.needsReload = true;
	}
	
	public void reload() {
		this.needsReload = false;
	}
	
	public boolean getNeedsReload() {
		return this.needsReload;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Robot other = (Robot) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
