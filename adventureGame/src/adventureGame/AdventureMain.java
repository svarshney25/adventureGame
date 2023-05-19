package adventureGame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entity.Player;

public class AdventureMain extends JFrame implements ActionListener{
		CardLayout card;
		Container pane;
		private JButton jungle;
		private JPanel panel;
		private JPanel j;
		private Tundra tundraClass;
		private JButton start;
		private JButton shop;
		private JButton rules;
		private Player player;
		private GamePanel gamePanel;
	
	public AdventureMain() {
		this.setLayout(new BorderLayout(10, 5));
		this.setTitle("Adventure Game");
		this.setSize(896, 768);
		this.setResizable(false);

		
		ImagePanel background = new ImagePanel(new ImageIcon("/Users/shivikavarshney/Desktop/beginningMap.png").getImage());
		this.getContentPane().add(background);
		this.pack();
		this.setVisible(true);
		
//		player = new Player(500, 500);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		
//		this.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {
//
//			}
//		
//			public void keyPressed(KeyEvent e) {
//				int code = e.getKeyCode();
//			
//				switch(code) {
//				case KeyEvent.VK_A:
//					player.setLocation(player.getX()-5, player.getY());
//					break;
//				case KeyEvent.VK_D:
//					player.setLocation(player.getX()+5, player.getY());
//					break;
//				case KeyEvent.VK_S:
//					player.setLocation(player.getX(), player.getY()+5);
//					break;
//				case KeyEvent.VK_W:
//					player.setLocation(player.getX(), player.getY()-5);
//					break;
//				}
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				
//			}
//		});
		this.setFocusable(true);
		
		start = new JButton("Start");
		panel.add(start);
		
		//when start is clicked a new screen should pop up leading to level 1
		start.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pane = getContentPane();
				pane.removeAll();
				
//				j = new JPanel();
				
				//add the player 
//				player = new Player(400,400);
//				pane.add(player, BorderLayout.CENTER);
				gamePanel = new GamePanel();
				pane.add(gamePanel);
				pack();
				setLocationRelativeTo(null);
				setVisible(true);
				
				pane.setFocusable(true);
				pane.setSize(896, 768);
				
				gamePanel.startGameThread();

				//the background image is set 
//				ImagePanel background = new ImagePanel(new ImageIcon("/Users/shivikavarshney/Desktop/jungle.png").getImage());
//				getContentPane().add(background);
//				repaint();
//				pack();
				
				pane.validate();
				pane.repaint();
				//add the panel 
				panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
				pane.add(panel, BorderLayout.SOUTH);	
				setVisible(true);
				
	}
			
});
		
		shop = new JButton("Shop");
		panel.add(shop);
		
		shop.addActionListener(new ActionListener() {
			
						@Override
				public void actionPerformed(ActionEvent e) {
					pane = getContentPane();
					pane.removeAll();
							
					j = new JPanel();
//					j.setBackground(Color.WHITE);
					ImagePanel background = new ImagePanel(new ImageIcon("/Users/shivikavarshney/Desktop/beginningMap.png").getImage());
					
					j.setSize(800, 500);
					
					pane.validate();
					pane.repaint();
					panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
					pane.add(panel, BorderLayout.SOUTH);	
					setVisible(true);
				}
						
		});

		
		this.add(panel, BorderLayout.SOUTH);		
		
		setVisible(true);
		
		
		this.setVisible(true); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new AdventureMain();
	}

}




//
//lava = new JButton("Lava");
//panel.add(lava);
//
//lava.addActionListener(new ActionListener() {
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		pane = getContentPane();
//		pane.removeAll();
//		
//		l = new JPanel();
//		l.setBackground(Color.RED);
//		l.setSize(800, 500);
//		pane.add(l);
//		pane.validate();
//		pane.repaint();
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
//		pane.add(panel, BorderLayout.SOUTH);
//		setVisible(true);
//	}
//	
//});