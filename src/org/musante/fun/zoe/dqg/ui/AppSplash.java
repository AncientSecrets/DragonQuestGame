package org.musante.fun.zoe.dqg.ui;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.SplashScreen;

public class AppSplash {
	
	private SplashScreen ss;

	public AppSplash() {
		ss = SplashScreen.getSplashScreen();
		
		if (ss != null) {
			// Dimension ssSize = ss.getSize();
			Graphics2D g = ss.createGraphics();
			g.setFont(new Font("Dialog", Font.PLAIN, 14));
			g.drawString("hello, world", 15, 15);
			ss.update();
		}
	}
	
	public void done() {
		ss.close();
	}

}
