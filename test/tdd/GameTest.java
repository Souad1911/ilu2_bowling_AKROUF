package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {
	private Game game = new Game();

	@Test
	void niveau1_1() {
		this.game.roll(0);
		assertEquals(this.game.score(), 0);
	}
	
	@Test
	void niveau1_2() {
		for(int i = 0; i < 20; i++) {
			this.game.roll(0);
		}
		assertEquals(this.game.score(), 0);
	}
	
	@Test
	void niveau1_3() {		
		for(int i = 0; i < 20; i++) {
			this.game.roll(1);
		}
		assertEquals(this.game.score(), 20);
	}
	
	@Test
	void niveau1_4() {		
		for(int i = 0; i < 10; i++) {
			this.game.roll(1);
		}
		
		for(int i = 0; i < 10; i++) {
			this.game.roll(2);
		}
		assertEquals(this.game.score(), 30);
	}

}
