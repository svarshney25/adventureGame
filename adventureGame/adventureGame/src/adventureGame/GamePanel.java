package adventureGame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import Entity.Player;
import tile.TileManager;

import java.awt.Color;
public class GamePanel extends JPanel implements Runnable{
	// screen presets and sizing
		private int ogTileSize = 32; // 32 x 32 tile
		private int scale = 2;
		
		private int tileSize = ogTileSize * scale; // 64 x 64 tile
		private int maxScreenCol = 14;
		private int maxScreenRow = 12;
		private int screenWidth = tileSize * maxScreenCol; // 896 pixels
		private int screenHeight = tileSize * maxScreenRow; // 768 pixels
		
		
		// world bounds
		private int lastWorldCol = 64;
		private int lastWorldRow = 64;
		private int worldWidth = tileSize * lastWorldRow;
		private int worldHeight = tileSize * lastWorldCol;
		
		private int FPS = 60;
		
		private TileManager tileM = new TileManager(this);
		private KeyHandler keyH = new KeyHandler();
		
		private Thread gameThread;
		
		private Player player = new Player(this, keyH);
		
		
		public GamePanel()
		{
			this.setPreferredSize(new Dimension(screenWidth, screenHeight));
			this.setBackground(Color.white);
			this.setDoubleBuffered(true);
			this.addKeyListener(keyH);
			this.setFocusable(true);
		}
		
		/** description of startGameThread()
		 * this creates a Thread, which was used instead of a timer for this code
		 * the Thread runs multiple tasks at once and helps with the timing and updating of the system
		 */
		public void startGameThread()
		{
			gameThread = new Thread(this);
			gameThread.start();
		}

		/** description of run()
		 * this sets up a system that is similar to a timer. 
		 * an interval is created that determines how often the images update
		 * update() is run when an interval is passed
		 * method by RyiSnow
		 */
		@Override
		public void run() 
		{
			double drawInterval = 1000000000/FPS;
			double delta = 0;
			long lastTime = System.nanoTime();
			long currentTime;
			while(gameThread != null)
			{			
				currentTime = System.nanoTime();
				
				delta += (currentTime-lastTime) / drawInterval;
				
				lastTime  = currentTime;
				
				if(delta >= 1)
				{
					update();
					repaint();
					delta--;
				}
				// 1 UPDATE: update information such as character position
				// 2 DRAW: draw the screen with the updated information
			}
		}
		/** description of update()
		 * updates the player information
		 */
		public void update()
		{
			player.update();
		}
		
		/** description of paintComponent(Graphics g)
		 * calls superclass and draws the player on top of the game tiles
		 * 
		 */
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			
			Graphics2D g2 = (Graphics2D)g;
			
			tileM.draw(g2);
			
			player.draw(g2);
			
			g2.dispose();
		}
		
		public int getTileSize()
		{
			return tileSize;
		}
		
		public void setTileSize(int x)
		{
			tileSize = x;
		}
		public int getMaxScreenCol()
		{
			return maxScreenCol;
		}
		
		public void setMaxScreenCol(int x)
		{
			maxScreenCol = x;
		}
		public int getMaxScreenRow()
		{
			return maxScreenRow;
		}
		
		public void setMaxScreenRow(int x)
		{
			maxScreenRow = x;
		}
		public int getScreenWidth()
		{
			return screenWidth;
		}
		
		public void setScreenWidth(int x)
		{
			screenWidth = x;
		}
		public int getScreenHeight()
		{
			return screenHeight;
		}
		
		public void setScreenHeight(int x)
		{
			screenHeight = x;
		}
		public int getLastWorldCol()
		{
			return lastWorldCol;
		}
		
		public void setLastWorldCol(int x)
		{
			lastWorldCol = x;
		}
		public int getLastWorldRow()
		{
			return lastWorldRow;
		}
		
		public void setLastWorldRow(int x)
		{
			lastWorldRow = x;
		}
		public int getWorldWidth()
		{
			return worldWidth;
		}
		
		public void setWorldWidth(int x)
		{
			worldWidth = x;
		}
		public int getWorldHeight()
		{
			return worldHeight;
		}
		
		public void setWorldHeight(int x)
		{
			worldHeight = x;
		}
		
		public Player getPlayer()
		{
			return player;
		}
		
		public void setPlayer(Player x)
		{
			player = x;
		}
}
