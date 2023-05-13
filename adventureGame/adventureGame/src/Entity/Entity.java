package Entity;

import java.awt.image.BufferedImage;

public class Entity {
	private int mapX, mapY;
	private int speed;
	
	private BufferedImage up1, up2, up3, up4, down1, down2, down3, down4, left1, left2, left3, left4, right1, right2, right3, right4;
	private String direction;
	
	private int spriteCounter = 0;
	private int spriteNum = 1;
	
	
	
	// A BUNCH OF GETTERS AND SETTERS
	
	public int getMapX() {
		return mapX;
	}
	public void setMapX(int mapX) {
		this.mapX = mapX;
	}
	
	public int getMapY() {
		return mapY;
	}
	public void setMapY(int mapY) {
		this.mapY = mapY;
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the up1
	 */
	public BufferedImage getUp1() {
		return up1;
	}
	/**
	 * @param up1 the up1 to set
	 */
	public void setUp1(BufferedImage up1) {
		this.up1 = up1;
	}
	/**
	 * @return the up2
	 */
	public BufferedImage getUp2() {
		return up2;
	}
	/**
	 * @param up2 the up2 to set
	 */
	public void setUp2(BufferedImage up2) {
		this.up2 = up2;
	}
	/**
	 * @return the up3
	 */
	public BufferedImage getUp3() {
		return up3;
	}
	/**
	 * @param up3 the up3 to set
	 */
	public void setUp3(BufferedImage up3) {
		this.up3 = up3;
	}
	/**
	 * @return the up4
	 */
	public BufferedImage getUp4() {
		return up4;
	}
	/**
	 * @param up4 the up4 to set
	 */
	public void setUp4(BufferedImage up4) {
		this.up4 = up4;
	}
	/**
	 * @return the down1
	 */
	public BufferedImage getDown1() {
		return down1;
	}
	/**
	 * @param down1 the down1 to set
	 */
	public void setDown1(BufferedImage down1) {
		this.down1 = down1;
	}
	/**
	 * @return the down2
	 */
	public BufferedImage getDown2() {
		return down2;
	}
	/**
	 * @param down2 the down2 to set
	 */
	public void setDown2(BufferedImage down2) {
		this.down2 = down2;
	}
	/**
	 * @return the down3
	 */
	public BufferedImage getDown3() {
		return down3;
	}
	/**
	 * @param down3 the down3 to set
	 */
	public void setDown3(BufferedImage down3) {
		this.down3 = down3;
	}
	/**
	 * @return the down4
	 */
	public BufferedImage getDown4() {
		return down4;
	}
	/**
	 * @param down4 the down4 to set
	 */
	public void setDown4(BufferedImage down4) {
		this.down4 = down4;
	}
	/**
	 * @return the left1
	 */
	public BufferedImage getLeft1() {
		return left1;
	}
	/**
	 * @param left1 the left1 to set
	 */
	public void setLeft1(BufferedImage left1) {
		this.left1 = left1;
	}
	/**
	 * @return the left2
	 */
	public BufferedImage getLeft2() {
		return left2;
	}
	/**
	 * @param left2 the left2 to set
	 */
	public void setLeft2(BufferedImage left2) {
		this.left2 = left2;
	}
	/**
	 * @return the left3
	 */
	public BufferedImage getLeft3() {
		return left3;
	}
	/**
	 * @param left3 the left3 to set
	 */
	public void setLeft3(BufferedImage left3) {
		this.left3 = left3;
	}
	/**
	 * @return the left4
	 */
	public BufferedImage getLeft4() {
		return left4;
	}
	/**
	 * @param left4 the left4 to set
	 */
	public void setLeft4(BufferedImage left4) {
		this.left4 = left4;
	}
	/**
	 * @return the right1
	 */
	public BufferedImage getRight1() {
		return right1;
	}
	/**
	 * @param right1 the right1 to set
	 */
	public void setRight1(BufferedImage right1) {
		this.right1 = right1;
	}
	/**
	 * @return the right2
	 */
	public BufferedImage getRight2() {
		return right2;
	}
	/**
	 * @param right2 the right2 to set
	 */
	public void setRight2(BufferedImage right2) {
		this.right2 = right2;
	}
	/**
	 * @return the right3
	 */
	public BufferedImage getRight3() {
		return right3;
	}
	/**
	 * @param right3 the right3 to set
	 */
	public void setRight3(BufferedImage right3) {
		this.right3 = right3;
	}
	/**
	 * @return the right4
	 */
	public BufferedImage getRight4() {
		return right4;
	}
	/**
	 * @param right4 the right4 to set
	 */
	public void setRight4(BufferedImage right4) {
		this.right4 = right4;
	}
	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}
	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}
	/**
	 * @return the spriteCounter
	 */
	public int getSpriteCounter() {
		return spriteCounter;
	}
	/**
	 * @param spriteCounter the spriteCounter to set
	 */
	public void setSpriteCounter(int spriteCounter) {
		this.spriteCounter = spriteCounter;
	}
	/**
	 * @return the spriteNum
	 */
	public int getSpriteNum() {
		return spriteNum;
	}
	/**
	 * @param spriteNum the spriteNum to set
	 */
	public void setSpriteNum(int spriteNum) {
		this.spriteNum = spriteNum;
	}
	
}

