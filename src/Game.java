
public class Game {
	
	private Map map;
	private Robot playerRobot;
	private Robot pcRobot;
	private boolean isRunning;
	private final int NUMBER_OF_ACTIONS = 2;
	private final int LENGTH = 10;
	private final int HEIGHT = 10;
	
	public Game() {
		this.map = new Map(LENGTH, HEIGHT);
		this.playerRobot = new Robot("Player", LENGTH, 0, Robot.Orientation.UP);
		this.pcRobot = new Robot("Enemy", 0, HEIGHT, Robot.Orientation.DOWN);
		this.isRunning = false;
	}
	
	public void start() {
		this.isRunning = true;
		while (this.isRunning) {
			System.out.println("True");
		}
	}
	
	private String availableActions(Robot robot) {
		return null;
	}
	
	private void actionCommand(String command) {
		
	}
	
	private boolean move(Robot robot) {
		return false;
	}
	
	private void scan(Robot robot) {
		
	}
	
	private void shoot(Robot robot) {
		
	}
	
	private void reload(Robot robot) {
		
	}
}
