package com.glibrary.components;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import com.glibrary.window.Window;

public class Text extends Window {
	private JLabel label;

	public static final int PLAIN = Font.BOLD;
	public static final int BOLD = Font.BOLD;
	public static final int ITALIC = Font.BOLD;

	public Text() {
		label = new JLabel();
		label.setForeground(new Color(150, 150, 150));
	}

	public void setText(String text) {
		label.setText(text);
	}
	
	public void setTransparent(boolean bool) {
		label.setOpaque(!bool);
	}

	public void setBounds(int x, int y, int width, int height) {
		label.setBounds(x, y - 20, width, height);
	}
	
	public void setBackground(int r, int g, int b) {
		label.setBackground(new Color(r, g, b));
	}
	
	public void setBackground(int r, int g, int b, int a) {
		label.setBackground(new Color(r, g, b, a));
	}

	public void setColor(int r, int g, int b) {
		label.setForeground(new Color(r, g, b));
	}
	
	public void setFont(String fontFamily, int fontStyle, int fontSize) {
		label.setFont(new Font(fontFamily, fontStyle, fontSize));
	}

	public void setColor(int r, int g, int b, int a) {
		label.setForeground(new Color(r, g, b, a));
	}
	
	public void addMouseEvent(MouseListener listener) {
        label.addMouseListener(listener);
    }
	
	public void addMouseMotionEvent(MouseMotionListener listener) {
        label.addMouseMotionListener(listener);
    }
	
	public void addKeyboardEvent(KeyListener listener) {
        label.addKeyListener(listener);
    }

	public void add() {
		frame.add(label);
	}
	
	public void add(JFrame frame) {
		frame.add(label);
	}

}
