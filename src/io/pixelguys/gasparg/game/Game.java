package io.pixelguys.gasparg.game;

import io.pixelguys.gasparg.Main;

public class Game {

	public Player player;
	
	public void process(String msg) {
		String[] mots = msg.split(" ");
		if (mots.length < 1) {
			Main.endPoint.write("?");
			return;
		}
		String verbe = mots[0];
		if (verbe.equals("explorer")) {
			String mot = mots[1];
			if (mot.equals("cave")) {
				
			} else {
				Main.endPoint.write("Mot invalide " + mot);
			}
		}
		if (verbe.equals("voir") || verbe.equals("regarder")) {
			
		}
	}
	
}
