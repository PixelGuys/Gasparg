package io.pixelguys.gasparg;

public class Gasparg {

	public static final Gasparg INSTANCE;
	
	static {
		INSTANCE = new Gasparg();
	}
	
	
	public void loop() {
		while (true) {
			update();
			render();
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void update() {
		
	}
	
	public void render() {
		
	}
	
}
