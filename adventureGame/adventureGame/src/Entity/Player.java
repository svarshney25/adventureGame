package Entity;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;

import adventureGame.GamePanel;
import adventureGame.KeyHandler;

public class Player extends Entity {
	private GamePanel gp;
	private KeyHandler keyH;
	private int screenX;
	private int screenY;
	
	public Player(GamePanel gp, KeyHandler keyH)
	{
		this.gp = gp;
		this.keyH = keyH;
		
		screenX = gp.getScreenWidth()/2 - (gp.getTileSize()/2);
		screenY = gp.getScreenHeight()/2 - (gp.getTileSize()/2);
		
		setDefaultValues();
		getPlayerImage();
	}
	
	/** description for setDefaultValues()
	 * sets default values for the player on the screen
	 * includes location, speed, and direction
	 */
	public void setDefaultValues()
	{
		setMapX(gp.getTileSize() * 31);
		setMapY(gp.getTileSize() *62);
		setSpeed(3);
		setDirection("down");
	}
	
	/** description for getPlayerImage()
	 * assigns images to BufferedImage variables that were created in Entity class
	 * uses try/catch
	 */
	public void getPlayerImage()
	{
		try
		{
			setUp1(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Backward/Backward_Rest.png")));
			setUp2(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Backward/Backward_LeftStep.png")));
			setUp3(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Backward/Backward_MidStep.png")));
			setUp4(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Backward/Backward_RightStep.png")));
			setDown1(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Forward/Forward_Rest.png")));
			setDown2(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Forward/Forward_LeftStep.png")));
			setDown3(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Forward/Forward_MidStep.png")));
			setDown4(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Forward/Forward_RightStep.png")));
			setLeft1(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Left/Left_Rest.png")));
			setLeft2(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Left/Left_LeftStep.png")));
			setLeft3(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Left/Left_MidStep.png")));
			setLeft4(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Left/Left_RightStep.png")));
			setRight1(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Right/Right_Rest.png")));
			setRight2(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Right/Right_LeftStep.png")));
			setRight3(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Right/Right_MidStep.png")));
			setRight4(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/Right/Right_RightStep.png")));

		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/** description for update()
	 * checks which keys are pressed and moves player accordingly
	 * if no keys are pressed, the player remains in an idle state in its respective direction
	 * spriteNum represents which animation frame the character is on
	 * character is put into loop of frames with spriteNum and spriteCounter conditions
	 */
	public void update()
	{
		if(keyH.isUpPressed() == true || keyH.isDownPressed() == true || keyH.isLeftPressed() == true || keyH.isRightPressed() == true)
		{
			
			if(keyH.isUpPressed() == true)
			{
				setDirection("up");
				super.setMapY(super.getMapY() - super.getSpeed());
			}
			else if(keyH.isDownPressed() == true)
			{
				setDirection("down");
				super.setMapY(super.getMapY() + super.getSpeed());
			}
			else if(keyH.isLeftPressed() == true)
			{
				setDirection("left");
				super.setMapX(super.getMapX() - super.getSpeed());
			}
			else if(keyH.isRightPressed() == true)
			{
				setDirection("right");
				super.setMapX(super.getMapX() + super.getSpeed());
			}
			setSpriteCounter(getSpriteCounter() + 1);
			if(getSpriteCounter() > 9)
			{
				if(getSpriteNum() == 1)
				{
					setSpriteNum(2);
				}
				else if(getSpriteNum() == 2)
				{
					setSpriteNum(3);
				}
				else if(getSpriteNum() == 3)
				{
					setSpriteNum(4);
				}
				else if(getSpriteNum() == 4)
				{
					setSpriteNum(1);
				}
				
				setSpriteCounter(0);
			}
		}
		else
		{
			setSpriteNum(1);
		}
		
	}
	
	/** description of draw(Graphics g2)
	 * assigns respective images to image and draws accordingly
	 * uses switch case
	 * @param g2
	 * Graphics parameter taken in to draw image
	 */
	public void draw(Graphics g2)
	{
		BufferedImage image = null;
		
		switch(getDirection())
		{
		case "up":
			if(getSpriteNum() == 1)
			{
				image = getUp1();
			}
			if(getSpriteNum() == 2)
			{
				image = getUp2();
			}
			if(getSpriteNum() == 3)
			{
				image = getUp3();
			}
			if(getSpriteNum() == 4)
			{
				image = getUp4();
			}
			break;
		case "down":
			if(getSpriteNum() == 1)
			{
				image = getDown1();
			}
			if(getSpriteNum() == 2)
			{
				image = getDown2();
			}
			if(getSpriteNum() == 3)
			{
				image = getDown3();
			}
			if(getSpriteNum() == 4)
			{
				image = getDown4();
			}
			break;
		case "left":
			if(getSpriteNum() == 1)
			{
				image = getLeft1();
			}
			if(getSpriteNum() == 2)
			{
				image = getLeft2();
			}
			if(getSpriteNum() == 3)
			{
				image = getLeft3();
			}
			if(getSpriteNum() == 4)
			{
				image = getLeft4();
			}
			break;
		case "right":
			if(getSpriteNum() == 1)
			{
				image = getRight1();
			}
			if(getSpriteNum() == 2)
			{
				image = getRight2();
			}
			if(getSpriteNum() == 3)
			{
				image = getRight3();
			}
			if(getSpriteNum() == 4)
			{
				image = getRight4();
			}
			break; 
		}
		
		g2.drawImage(image,  screenX,  screenY,  gp.getTileSize(), gp.getTileSize(),  null);
		
	}
	
	public int getScreenX()
	{
		return screenX;
	}
	
	public int getScreenY()
	{
		return screenY;
	}
	public void setScreenX(int x)
	{
		screenX = x;
	}
	
	public void setScreenY(int y)
	{
		 screenY = y;
	}
	
}
//public class Player extends JComponent {
//	private Ellipse2D.Double head;
//    private Rectangle body;
//    private Rectangle leftLeg;
//    private Rectangle leftArm;
//    private Rectangle rightLeg;
//    private Rectangle rightArm;
//    private int dx;
//    private int dy;
//    
//  public Player(int x, int y)
//    {
//        dx = 0;
//        dy = 0;
//        head = new Ellipse2D.Double(7,0,11,11);
//        body = new Rectangle(8,10,10,20);
//        leftArm = new Rectangle(0,10,10,5);
//        leftLeg = new Rectangle(7,30,5,15);
//        rightLeg = new Rectangle(14,30,5,15);
//        rightArm = new Rectangle(18,10,10,5);
//        this.setBounds(x,y,25,45);
//        
//        this.setFocusable(false);
//    }
//  	public int bodyHeight() {
//	  return 25;
//    }
//    public int getDx() {
//		return dx;
//	} 
//	public int getDy() {
//		return dy;
//	}
//	public void setDx(int dx) {
//		this.dx = dx;
//	}
//	public void setDy(int dy) {
//		this.dy = dy;
//	}
//	public void update() {
//		this.setLocation(getX() + dx, getY() + dy);
//	}
//    public void paintComponent(Graphics g)
//    {
//        Graphics2D g2 = (Graphics2D) g;
//
//        g2.setColor(Color.BLUE);
//        g2.fill(head);
//        g2.fill(body);
//        g2.fill(leftArm);
//        g2.fill(leftLeg);
//        g2.fill(rightArm);
//        g2.fill(rightLeg);
//    }
//    
//}
