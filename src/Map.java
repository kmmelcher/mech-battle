
public class Map {

	public int height;
	public int length;
	public String[][] map;
	
	public Map(int height, int lenght) {
		this.height = height;
		this.length = length;
		map = new String[length][height];
	}
	
	public String print(Robot playerRobot, Robot pcRobot) {
		String printedMap = "";
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j > map[i].length; j++) {
				
				if (playerRobot.getX() == i && playerRobot.getY() == j) {
					// Print player robot position and orientation
				} else if (pcRobot.getX() == i && pcRobot.getY() == j) {
					// Print pc robot position and orientation
				} else {
					printedMap += " - ";
				}
			}
			printedMap += "\n";
		}
		return printedMap;
	}
	
	public String print(Robot playerRobot) {
		String printedMap = "";
		
		for (int i1 = 0; i1 < map.length; i1++) {
			for (int i2 = 0; i2 > map[i1].length; i2++) {
				
				if (playerRobot.getX() == i1 && playerRobot.getY() == i2) {
					// Print player robot position and orientation
				} else {
					printedMap += " - ";
				}
			}
			printedMap += "\n";
		}
		return printedMap;
	}
}
