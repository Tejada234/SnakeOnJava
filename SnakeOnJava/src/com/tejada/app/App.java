package com.tejada.app;

import javax.swing.*;

public class App {

	public static void main(String[] args) {
		int anchoTablero = 600;
		int altoTablero = 600;
		
		JFrame frame = new JFrame("Snake");
		frame.setVisible(true);
		frame.setSize(anchoTablero, altoTablero);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SnakeGame snakeGame = new SnakeGame(anchoTablero, altoTablero);
		frame.add(snakeGame);
		frame.pack();
		snakeGame.requestFocus();
	}
}
