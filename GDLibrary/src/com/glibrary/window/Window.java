package com.glibrary.window;

import java.awt.*;
import java.io.*;

import javax.swing.*;

public class Window {
	public static JFrame frame;
	private static boolean initialized = false;
	
	public static final LayoutManager FREE_FORM = null;
	public static final LayoutManager GRID = new GridLayout();

	public static boolean windowInit() {
		frame = new JFrame();
		initialized = true;
		return initialized;
	}

	public static void windowCreate(String title, int width, int height) {
		if (title == "") {
			frame.setTitle("GDLibrary App");
		} else {
			frame.setTitle(title);
		}

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setIconImage(new ImageIcon("src/icon64.png").getImage());
		frame.setSize(width, height);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(Color.BLACK);
	}
	
	public static void windowSetLayout(LayoutManager layout) {
		frame.setLayout(layout);
	}

	public static void windowSetResizable(boolean bool) {
		frame.setResizable(bool);
	}

	public static void showWindow() {
		frame.revalidate();
		frame.setVisible(true);
	}
	
	public static JFrame getWindow() {
		return frame;
	}

}
