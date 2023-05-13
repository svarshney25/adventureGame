package adventureGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Entity.Player;

public class Tundra extends JFrame implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
//
//	private JPanel panel;
//	private Container pane;
//	private JLabel level1text;
//	private Player player;
//	@Override
//	public void actionPerformed(ActionEvent e) {
//
//		this.setLayout(new BorderLayout(10, 5));
//		this.setTitle("Adventure Game");
//		this.setSize(800, 500);
//		
//		player = new Player(400, 400);
//		JLabel message = new JLabel("Welcome");
//		message.setBounds(400,400,100,100);
//		this.add(message);
//		
//		panel = new JPanel();
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
//		
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
//
//		
//	}

}
