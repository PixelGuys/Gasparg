package io.pixelguys.gasparg.game;

import java.util.HashMap;

import io.pixelguys.gasparg.Main;
import io.pixelguys.gasparg.endroits.ChambreMaison;
import io.pixelguys.gasparg.endroits.Endroit;
import io.pixelguys.gasparg.endroits.SalonMaison;

public class Game {

	public Player player = new Player();
	
	public static HashMap<String, Endroit> endroits = new HashMap<>();
	
	static {
		endroits.put("chambre_maison", new ChambreMaison());
		endroits.put("salon_maison", new SalonMaison());
	}
	
	public static Endroit getLocationFrom(String title) {
		for (Endroit endroit : endroits.values()) {
			if (endroit.getName().equals(title)) {
				return endroit;
			}
		}
		return null;
	}
	
	public void process(String msg) {
		String[] mots = msg.split(" ");
		for (int i = 0; i < mots.length; i++) {
			mots[i] = mots[i].toLowerCase();
		}
		String verbe = mots[0];
		if (verbe.equals("explorer") || verbe.equals("aller")) {
			if (mots.length < 2) {
				Main.endPoint.write("Explorer quoi ?");
				return;
			}
			StringBuilder voulu = new StringBuilder();
			for (int i = 1; i < mots.length; i++) {
				voulu.append(mots[i]);
				if (i < mots.length-1) {
					voulu.append(" ");
				}
			}
			Endroit endroit = endroits.get(player.location);
			if (endroit.getName().equals(voulu.toString())) {
				Main.endPoint.write("Je suis déja dans " + voulu.toString() + ".");
				return;
			}
			for (String place : endroit.getPlaces()) {
				if (place.equals(voulu.toString())) {
					player.location = getLocationFrom(voulu.toString()).getId();
					return;
				}
			}
			Main.endPoint.write("Je ne peut pas aller dans " + voulu.toString() + ".");
		}
		else if (verbe.equals("voir") || verbe.equals("regarder")) {
			if (mots.length < 2) {
				Main.endPoint.write("Regarder quoi ?");
				return;
			}

			String mot = mots[1];
			Endroit endroit = endroits.get(player.location);
			
			if (mot.equals("lieu")) {
				Main.endPoint.write("Je suis dans " + endroit.getName() + ".");
				return;
			}
			if (mot.equals("sorties")) {
				StringBuilder sb = new StringBuilder();
				sb.append("Je peut aller dans ");
				for (int i = 0; i < endroit.getPlaces().length; i++) {
					sb.append(endroit.getPlaces()[i]);
					if (i < endroit.getPlaces().length-1) {
						sb.append(", ");
					}
				}
				sb.append(".");
				Main.endPoint.write(sb.toString());
				return;
			}
			if (mot.equals("objets")) {
				StringBuilder sb = new StringBuilder();
				sb.append("Il y'a ");
				for (int i = 0; i < endroit.getObjects().length; i++) {
					sb.append("un ");
					sb.append(endroit.getObjects()[i]);
					if (i < endroit.getObjects().length-1) {
						sb.append(", ");
					}
				}
				sb.append(".");
				Main.endPoint.write(sb.toString());
				return;
			}
			
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
