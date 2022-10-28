package src;

public class Robot {

	public enum Orientation {
		UP, DOWN, LEFT, RIGHT;
	}
	
	private String name;
	private Orientation orientation;
	private boolean needsReload;
	private int x;
	private int y;
	
	public Robot(String name, int x, int y, Orientation orientation) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.needsReload = false;
		this.orientation = orientation;
	}
	
	public void spin(Orientation direction) {
		this.orientation = direction;
	}
	
	public void move() {
		
		switch (this.orientation) {
		case UP:
			this.x++;
			break;
		case DOWN:
			this.x--;
			break;
		case LEFT:
			this.y++;
			break;
		case RIGHT:
			this.y--;
			break;
		}
	}
	
	public boolean shoot(int enemyX, int enemyY) {
		boolean isEnemyDestroyed = false;
		
		switch (this.orientation) {
		case UP:
			if (enemyY == this.y && enemyX <= this.x+2) {
				isEnemyDestroyed = true;
			}
			break;
		case DOWN:
			if (enemyY == this.y && enemyX <= this.x-2) {
				isEnemyDestroyed = true;
			}
			break;
		case LEFT:
			if (enemyX == this.x && enemyY <= this.y-2) {
				isEnemyDestroyed = true;
			}
			break;
		case RIGHT:
			if (enemyX == this.x && enemyY <= this.y+2) {
				isEnemyDestroyed = true;
			}
			break;
		}
		
		this.needsReload = true;
		return isEnemyDestroyed;
	}
	
	public void reload() {
		this.needsReload = false;
	}
	
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
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
	
	public Orientation getOrientation() {
		return this.orientation;
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
