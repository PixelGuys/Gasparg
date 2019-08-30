package io.pixelguys.gasparg.endroits;

public class QuartierLocal extends Endroit {

	@Override
	public String getName() {
		return "mon quartier";
	}

	@Override
	public boolean hasObject(String object) {
		return false;
	}

	@Override
	public boolean canGoTo(String place) {
		return place.equals("le salon de ma maison");
	}

	@Override
	public String getObjectText(String object) {
		return null;
	}

	@Override
	public String[] getPlaces() {
		return new String[] {"le salon de ma maison"};
	}

	@Override
	public String[] getObjects() {
		return new String[] {};
	}

	@Override
	public String getId() {
		return "quartier_local";
	}

}
