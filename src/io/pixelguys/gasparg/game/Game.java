package io.pixelguys.gasparg.game;

import io.pixelguys.gasparg.Main;

public class Game {

	public Player player = new Player();
	
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
				Main.endPoint.write("Y'a " + mot);
			}
		}
		else if (verbe.equals("voir") || verbe.equals("regarder")) {
			if (mots.length < 2) {
				Main.endPoint.write("Regarder quoi?");
				return;
			}
			String mot = mots[1];
			if (mot.equals("ordinateur")) {
				if (player.location.equals("chambre de la maison")) {
					Main.endPoint.write("Je vois des fenêtres de code: Eclipse, GitHub Desktop, Sublime Text, Notepad++\n"
							+ "J'étais entrain de coder une IA qui allait révolutionner le monde, car elle peut penser!\n"
							+ "Je la présenterais le jour venu...");
				}
			} else {
				Main.endPoint.write("Il n'y a pas de " + mot);
			}
		}
		else {
			Main.endPoint.write("?");
		}
	}
	
}
