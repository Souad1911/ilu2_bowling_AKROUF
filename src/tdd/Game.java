package tdd;

public class Game {
	private int score;
	
	public Game() {
		super();
		this.score = 0;
	}
	
	public void roll(int nombreQuilles) {
		
		System.out.println("Current Score : "+ this.score);
		
		this.score+=nombreQuilles;
		
		System.out.println("New Score : "+ this.score);
	}
	
	public int score() {
		return this.score;
	}
}
 