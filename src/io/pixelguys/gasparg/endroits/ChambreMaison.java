package io.pixelguys.gasparg.endroits;

public class ChambreMaison extends Endroit {

	@Override
	public String getName() {
		return "ma chambre";
	}

	@Override
	public boolean hasObject(String object) {
		return object.equals("ordinateur");
	}

	@Override
	public boolean canGoTo(String place) {
		return place.equals("le salon de ma maison");
	}
	
	@Override
	public String[] getPlaces() {
		return new String[] {"le salon de ma maison"};
	}

	@Override
	public String getObjectText(String object) {
		if (object.equals("ordinateur")) {
			return "Je vois des fenêtres de code: Eclipse, GitHub Desktop, Sublime Text, Notepad++, etc.\n"
					+ "J'étais entrain de coder une IA qui allait révolutionner le monde, car elle peut penser!\n"
					+ "Je la présenterais le jour venu...";
		}
		return null;
	}

	@Override
	public String[] getObjects() {
		return new String[] {"ordinateur"};
	}

	@Override
	public String getId() {
		return "chambre_maison";
	}

}
