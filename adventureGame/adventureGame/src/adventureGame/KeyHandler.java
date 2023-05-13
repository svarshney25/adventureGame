package adventureGame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	private boolean upPressed, downPressed, leftPressed, rightPressed;
	private boolean upReleased, downReleased, leftReleased, rightReleased;

	@Override
	public void keyTyped(KeyEvent e) 
	{
		
	}

	/** description of keyPressed(KeyEvent e)
	 * user keyboard input is taken in and logs whether a key has been pressed
	 * uses switch case
	 * parameter KeyEvent taken in to log key clicks

	 */
	@Override
	public void keyPressed(KeyEvent e) 
	{
		int code = e.getKeyCode();
		switch(code)
		{
		case KeyEvent.VK_W:
			setUpPressed(true);
			setUpReleased(false);
			break;
		case KeyEvent.VK_A:
			setLeftPressed(true);
			setLeftReleased(false);
			break;
		case KeyEvent.VK_S:
			setDownPressed(true);
			setDownReleased(false);
			break;
		case KeyEvent.VK_D:
			setRightPressed(true);
			setRightReleased(false);
			break;
		}
	}

	/** description of keyReleased(KeyEvent e)
	 * user keyboard input is taken in and logs whether a key has been released
	 * uses switch case
	 * parameter KeyEvent taken in to log key clicks
	 */
	@Override
	public void keyReleased(KeyEvent e) 
	{
		int code = e.getKeyCode();
		switch(code)
		{
		case KeyEvent.VK_W:
			setUpPressed(false);
			setUpReleased(true);
			break;
		case KeyEvent.VK_A:
			setLeftPressed(false);
			setLeftReleased(true);
			break;
		case KeyEvent.VK_S:
			setDownPressed(false);
			setDownReleased(true);
			break;
		case KeyEvent.VK_D:
			setRightPressed(false);
			setRightReleased(true);
			break;
		}
	}

	public boolean isUpPressed() {
		return upPressed;
	}

	public void setUpPressed(boolean upPressed) {
		this.upPressed = upPressed;
	}

	public boolean isDownPressed() {
		return downPressed;
	}

	public void setDownPressed(boolean downPressed) {
		this.downPressed = downPressed;
	}

	public boolean isLeftPressed() {
		return leftPressed;
	}

	public void setLeftPressed(boolean leftPressed) {
		this.leftPressed = leftPressed;
	}

	public boolean isRightPressed() {
		return rightPressed;
	}

	public void setRightPressed(boolean rightPressed) {
		this.rightPressed = rightPressed;
	}

	public boolean isUpReleased() {
		return upReleased;
	}

	public void setUpReleased(boolean upReleased) {
		this.upReleased = upReleased;
	}

	public boolean isDownReleased() {
		return downReleased;
	}

	public void setDownReleased(boolean downReleased) {
		this.downReleased = downReleased;
	}

	public boolean isLeftReleased() {
		return leftReleased;
	}

	public void setLeftReleased(boolean leftReleased) {
		this.leftReleased = leftReleased;
	}

	public boolean isRightReleased() {
		return rightReleased;
	}

	public void setRightReleased(boolean rightReleased) {
		this.rightReleased = rightReleased;
	}
}
