package io.pixelguys.gasparg.endroits;

public abstract class Endroit {

	public abstract String getName();
	public abstract boolean hasObject(String object);
	public abstract boolean canGoTo(String place);
	public abstract String getObjectText(String object);
	public abstract String[] getPlaces();
	public abstract String[] getObjects();
	public abstract String getId();
	
}
