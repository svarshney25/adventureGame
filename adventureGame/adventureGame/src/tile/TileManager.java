package tile;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

import javax.imageio.ImageIO;
import adventureGame.GamePanel;

import java.awt.Graphics;

public class TileManager {
	private GamePanel gp;
	private Tile[] tile;
	private int mapTileNum[][];
	
	public TileManager(GamePanel gp)
	{
		this.gp = gp;
		tile = new Tile[20];
		mapTileNum = new int[gp.getLastWorldCol()][gp.getLastWorldRow()];
		getTileImage();
		loadMap("/adventureGame/res1/maps/message (1).txt");
	}
	
	public void getTileImage()
	{
		try 
		{
			tile[0] = new Tile();
			tile[0].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_grass.png")));
			
			tile[1] = new Tile();
			tile[1].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_path1.png"))); 
			
			tile[2] = new Tile();
			tile[2].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_path2.png")));
			
			tile[3] = new Tile();
			tile[3].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_path3.png")));
			
			tile[4] = new Tile();
			tile[4].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_path4.png")));
			
			tile[5] = new Tile();
			tile[5].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_tree.png")));
			
			tile[6] = new Tile();
			tile[6].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_stump.png")));
			
			tile[7] = new Tile();
			tile[7].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_flowers.png")));
			
			tile[8] = new Tile();
			tile[8].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_path5.png")));
			
			tile[9] = new Tile();
			tile[9].setImage(ImageIO.read(getClass().getResourceAsStream("/adventureGame/res1/tiles/jungle_tree2.png")));
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void loadMap(String filePath)
	{
		try
		{
			InputStream is = getClass().getResourceAsStream(filePath);
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			int col = 0;
			int row = 0;
			
			while(col < gp.getLastWorldCol() && row < gp.getLastWorldRow())
			{
				String line = br.readLine();
				
				while(col < gp.getLastWorldCol())
				{
					String numbers[] = line.split(" "); // makes sure that text input numbers come one by one
					
					int num = Integer.parseInt(numbers[col]); // changes input text from string to integer
					
					mapTileNum[col][row] = num;
					col++;
				}
				if(col == gp.getLastWorldCol()) // hits end of cols
				{
					col = 0;
					row++;
				}
			}
			br.close();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void draw(Graphics g2)
	{
		int worldCol = 0;
		int worldRow = 0;
		
		while(worldCol < gp.getLastWorldCol() && worldRow < gp.getLastWorldRow())
		{
			int tileNum = mapTileNum[worldCol][worldRow]; // index of array
			
			int mapX = worldCol * gp.getTileSize();
			int mapY = worldRow * gp.getTileSize();
			int screenX = mapX - gp.getPlayer().getMapX() + gp.getPlayer().getScreenX();
			int screenY = mapY - gp.getPlayer().getMapY() + gp.getPlayer().getScreenY();
			
			
			g2.drawImage(tile[tileNum].getImage(),screenX,screenY,gp.getTileSize(),gp.getTileSize(),null);
			worldCol++;;
			
			if(worldCol == gp.getLastWorldCol())
			{
				worldCol = 0;
				worldRow++;
			}
		}
	}
}
