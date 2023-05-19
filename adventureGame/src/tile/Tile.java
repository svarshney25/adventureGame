package tile;

import java.awt.image.BufferedImage;

public class Tile {
	private BufferedImage image;
	private boolean collision = false;
	
	/** description for getImage()
	 * allows coder to get image from this class
	 * @return
	 * desired image returned from class
	 */
	public BufferedImage getImage()
	{
		return image;
	}
	
	/** description of setImage(BufferedImage b)
	 * this method sets the image to the wanted one
	 * @param b
	 * the desired image that is to be used
	 */
	public void setImage(BufferedImage b)
	{
		image = b;
	}
}
