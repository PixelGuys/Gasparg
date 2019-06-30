package io.pixelguys.gasparg.endpoint;

import java.io.IOException;

public abstract class EndPoint {

	public abstract void write(Object out);
	public abstract void notification(Object out);
	public abstract void debug(Object out);
	public abstract String read();
	
	public abstract void close() throws IOException;
	
}
