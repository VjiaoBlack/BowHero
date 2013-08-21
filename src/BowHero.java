import java.awt.Frame;


public class BowHero { /// and this calls the run() in the game and holds other data like 
	private static Screen _screen;
	private static Frame _frame;

	
	public static void main(String[] args){  // hours played, etc.
		_screen = new Screen();
		_frame = new Frame();
		_frame.setTitle("BowHero");
		_frame.setSize(800,640);
		_frame.setResizable(false);
		_frame.add(_screen);
		_frame.setVisible(true);
	}
}
