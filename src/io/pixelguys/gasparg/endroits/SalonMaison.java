package io.pixelguys.gasparg.endroits;

public class SalonMaison extends Endroit {

	@Override
	public String getName() {
		return "le salon de ma maison";
	}

	@Override
	public boolean hasObject(String object) {
		return object.equals("photo") || object.equals("photographie");
	}

	@Override
	public boolean canGoTo(String place) {
		return place.equals("chambre") || place.equals("dehors");
	}
	
	@Override
	public String[] getPlaces() {
		return new String[] {"ma chambre", "dehors"};
	}

	@Override
	public String getObjectText(String object) {
		if (object.equals("photo") || object.equals("photographie")) {
			return "Sur cette photographie, il y'a mon père, ma mère et moi.. avant que ma mère meurt..";
		}
		return null;
	}

	@Override
	public String[] getObjects() {
		return new String[] {"photographie"};
	}

	@Override
	public String getId() {
		return "salon_maison";
	}

}
