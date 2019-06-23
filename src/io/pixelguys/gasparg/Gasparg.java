package io.pixelguys.gasparg;

import javafx.application.Platform;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Gasparg {

	public static final Gasparg INSTANCE;
	
	static {
		INSTANCE = new Gasparg();
	}
	
	
	public void loop() {
		while (true) {
			update();
			Platform.runLater(() -> {
				render();
			});
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
		GraphicsContext ctx = GaspargGraphics.canvas.getGraphicsContext2D();
		ctx.setFill(Color.BLACK);
		ctx.fillRect(0, 0, 800, 600);
		ctx.setFill(Color.WHITE);
		ctx.fillRect(0, 0, 100, 100);
		ctx.fillRect(700, 500, 100, 100);
	}
	
}
