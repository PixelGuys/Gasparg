package io.pixelguys.gasparg.game;

import io.pixelguys.gasparg.Main;

public class Game {

	public Player player;
	
	public void process(String msg) {
		String[] mots = msg.split(" ");
		for (int i = 0; i < mots.length; i++) {
			mots[i] = mots[i].toLowerCase();
		}
		String verbe = mots[0];
		if (verbe.equals("explorer")) {
			if (mots.length < 2) {
				Main.endPoint.write("Explorer quoi?");
				return;
			}
			String mot = mots[1];
			if (mot.equals("cave")) {
				
			} else {
				Main.endPoint.write("Mot invalide " + mot);
			}
		}
		else if (verbe.equals("voir") || verbe.equals("regarder")) {
			if (mots.length < 2) {
				Main.endPoint.write("Regarder quoi?");
				return;
			}
		}
		else {
			Main.endPoint.write("?");
		}
	}
	
}
