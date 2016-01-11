package org.musante.fun.zoe.dqg.main;

import org.musante.fun.zoe.dqg.ui.AppSplash;

public class Main {

	public static void main(String[] argv) {
		AppSplash splash = new AppSplash();
		
		try {
			Thread.sleep(2000);
		}
		
		catch (InterruptedException ex) {
			// ignore
		}
		
		splash.done();
	}
}
