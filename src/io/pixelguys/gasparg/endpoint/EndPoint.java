package io.pixelguys.gasparg.endpoint;

public abstract class EndPoint {

	public abstract void write(Object out);
	public abstract void notification(Object out);
	public abstract void debug(Object out);
	public abstract String read();
	
}
