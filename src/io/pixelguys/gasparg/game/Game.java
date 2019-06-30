package io.pixelguys.gasparg.game;

import java.util.HashMap;

import io.pixelguys.gasparg.Main;
import io.pixelguys.gasparg.endroits.ChambreMaison;
import io.pixelguys.gasparg.endroits.Endroit;

public class Game {

	public Player player = new Player();
	
	public static HashMap<String, Endroit> endroits = new HashMap<>();
	
	static {
		endroits.put("chambre_maison", new ChambreMaison());
	}
	
	public void process(String msg) {
		String[] mots = msg.split(" ");
		for (int i = 0; i < mots.length; i++) {
			mots[i] = mots[i].toLowerCase();
		}
		String verbe = mots[0];
		if (verbe.equals("explorer")) {
			if (mots.length < 2) {
				Main.endPoint.write("Explorer quoi ?");
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
				Main.endPoint.write("Regarder quoi ?");
				return;
			}

			String mot = mots[1];
			Endroit endroit = endroits.get(player.location);
			
			if (endroit.hasObject(mot)) {
				if (endroit.getObjectText(mot) != null) {
					Main.endPoint.write(endroit.getObjectText(mot));
				} else {
					Main.endPoint.write("Il n'y a rien à voir dessus.");
				}
			} else {
				Main.endPoint.write("Il n'y a pas de " + mot + ".");
			}
		}
		else {
			Main.endPoint.write("?");
		}
	}
	
}
