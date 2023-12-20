package com.glibrary;

import static com.glibrary.window.Window.*;

import java.awt.event.*;

import javax.swing.*;

import com.glibrary.components.*;

public class Demo {
	
	private static int y = -200;
	private static int textAlpha = 0;

	public static void main(String[] args) {
		windowInit();
		windowCreate("", 960, 540);
		windowSetResizable(false);
		windowSetLayout(FREE_FORM);
		showWindow();

		Text title = new Text();
		title.setText("Hello World!");
		title.setBounds(100, y, 200, 50);
		title.setFont("Monospaced", Text.BOLD, 28);
		title.setColor(255, 255, 255, textAlpha);
		title.add();
		
		Text description = new Text();
		description.setText("Welcome to the GD Library, where you can create awesome things!");
		description.setBounds(100, y + 20, 700, 100);
		description.setFont("Monospaced", Text.BOLD, 16);
		description.setColor(255, 255, 255, textAlpha);
		description.add();
		
		Text about = new Text();
		about.setText("GDLibrary © 2023");
		about.setBounds(960 - 200, 540 - 100, 200, 100);
		about.setFont("Monospaced", Text.BOLD, 16);
		about.setColor(255, 255, 255, textAlpha);
		about.add();
		
		Timer timer = new Timer(1000 / 240, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				y += 10;
				if (y >= 200) {
					y = 200;
				}
				if (y >= 0) {
					textAlpha += 5;
				}
				if (textAlpha >= 255) {
					textAlpha = 255;
				}
				
				title.setBounds(100, y, 300, 50);
				title.setColor(255, 255, 255, textAlpha);
				
				description.setBounds(100, y + 20, 700, 100);
				description.setColor(255, 255, 255, textAlpha);

				about.setColor(255, 255, 255, textAlpha);
			}
		});
		timer.start();
	}
}
