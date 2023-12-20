package com.glibrary.components;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.glibrary.window.Window;

public class Button extends Window {
	private JButton button;
	private Color buttonColor;

	public Button() {
		button = new JButton();
	}

	public void setText(String text) {
		button.setText(text);
	}

	public void setBounds(int x, int y, int width, int height) {
		button.setBounds(x, y - 20, width, height);
	}

	public void preventDefault() {
		button.setFocusPainted(false);
		button.setBorderPainted(false);
	}

	public void setBackground(int r, int g, int b) {
		buttonColor = new Color(r, g, b);
		button.setBackground(buttonColor);
	}

	public void setBackground(int r, int g, int b, int a) {
		buttonColor = new Color(r, g, b, a);
		button.setBackground(buttonColor);
	}

	public void setColor(int r, int g, int b) {
		button.setForeground(new Color(r, g, b));
	}

	public void setFont(String fontFamily, int fontStyle, int fontSize) {
		button.setFont(new Font(fontFamily, fontStyle, fontSize));
	}

	public void setColor(int r, int g, int b, int a) {
		button.setForeground(new Color(r, g, b, a));
	}
	
	public void addActionEvent(ActionListener listener) {
		button.addActionListener(listener);
	}

	public void addMouseEvent(MouseListener listener) {
		button.addMouseListener(listener);
	}

	public void addMouseMotionEvent(MouseMotionListener listener) {
		button.addMouseMotionListener(listener);
	}

	public void addKeyboardEvent(KeyListener listener) {
		button.addKeyListener(listener);
	}

	public void add() {
		frame.add(button);
	}

	public void add(JFrame frame) {
		frame.add(button);
	}

}
