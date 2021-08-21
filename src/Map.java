public class Map {

	public int height;
	public int length;
	public String[][] map;
	
	public Map(int height, int length) {
		this.height = height;
		this.length = length;
		map = new String[length][height];
	}
	/*
	 * 2- printar encontros de orientação
	 * 3- printar orientação
	 * 4- printar posição vazia
	 */
	
	public String print(Robot playerRobot, Robot pcRobot) {
		String printedMap = "";
		
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y < map[x].length; y++) {
				
				String partOfTheMap = "";
				
				String playerOrientation = printOrientation(playerRobot, x, y);
				String pcOrientation = printOrientation(pcRobot, x, y);
				
				if (playerOrientation.equals(" - ")) {
					partOfTheMap = pcOrientation;
				} else if (pcOrientation.equals(" - ")) {
					partOfTheMap = playerOrientation;
				} else if (playerOrientation.equals(" ᐸ ") && pcOrientation.equals(" ᐳ ")) {
					
					if (playerRobot.getX() == pcRobot.getX() && pcRobot.getY() < y && playerRobot.getY() > y) {
						partOfTheMap = " ⇄ ";
					} else {
						partOfTheMap = pcOrientation;
					}
				} else if (playerOrientation.equals(" ᐳ ") && pcOrientation.equals(" ᐸ ")) {
					
					if (playerRobot.getX() == pcRobot.getX() && pcRobot.getY() > y && playerRobot.getY() < y) {
						partOfTheMap = " ⇄ ";
					} else {
						partOfTheMap = pcOrientation;
					}
				} else if ((playerOrientation.equals(" ᐱ ") && pcOrientation.equals(" ᐯ "))) {
					
					if (playerRobot.getY() == pcRobot.getY() && pcRobot.getX() < x && playerRobot.getX() > x) {
						partOfTheMap = " ⇅ ";
					} else {
						partOfTheMap = pcOrientation;
					}
				} else if (playerOrientation.equals(" ᐯ ") && pcOrientation.equals(" ᐱ ")){
					
					if (playerRobot.getY() == pcRobot.getY() && pcRobot.getX() > x && playerRobot.getX() < x) {
						partOfTheMap = " ⇅ ";
					} else {
						partOfTheMap = pcOrientation;
					}
				}
				
				// Print bots
				if (playerRobot.getX() == x && playerRobot.getY() == y) {
					partOfTheMap = " 🤖 ";
				} else if (pcRobot.getX() == x && pcRobot.getY() == y) {
					partOfTheMap = " 👾 ";
				}
				
				printedMap += partOfTheMap;
			}
			printedMap += "\n";
		}
		return printedMap;
	}
	
	public String print(Robot robot) {
		String printedMap = "";
		
		for (int x = 0; x < map.length; x++) {
			for (int y = 0; y > map[x].length; y++) {
				
				String partOfTheMap = printOrientation(robot, x, y);
				
				if (robot.getX() == x && robot.getY() == y) {
					partOfTheMap = " 🤖 ";
				}
			}
			printedMap += "\n";
		}
		return printedMap.trim();
	}
	
	private String printOrientation(Robot robot, int x, int y) {
		String arrow = " - ";
		
		switch (robot.getOrientation()) {
		case UP:
			if (robot.getY() == y) {
				arrow = " ᐱ ";
			}
			break;
		case DOWN:
			if (robot.getY() == y) {
				arrow = " ᐯ ";
			}
			break;
		case LEFT:
			if (robot.getX() == x) {
				arrow = " ᐸ ";
			}
			break;
		case RIGHT:
			if (robot.getX() == x) {
				arrow = " ᐳ ";
			}
			break;
		}
		
		return arrow;
	}
}
