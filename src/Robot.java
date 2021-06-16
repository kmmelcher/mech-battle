public class Robot {

	private String name;
	private String orientation;
	private boolean needsReload;
	private int x;
	private int y;
	
	public Robot(String name, int x, int y) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.needsReload = false;
		this.orientation = "up";
	}
	
	public void spin(String direction) {
		
	}
	
	public boolean move() {
		
	}
	
	public void scan() {
		
	}
	
	public void shoot() {
		
	}
	
	public void reload() {
		
	}
	
	public boolean getNeedsReload() {
		return this.needsReload;
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
