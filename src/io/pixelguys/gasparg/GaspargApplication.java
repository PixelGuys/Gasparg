package io.pixelguys.gasparg;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GaspargApplication extends Application {
	
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		GaspargGraphics.stage = stage;
		BorderPane pane = new BorderPane();
		Scene scene = new Scene(pane, 800, 600);
		GaspargGraphics.scene = scene;
		stage.setScene(scene);
		stage.setMinWidth(800);
		stage.setMinHeight(600);
		stage.setTitle("Gasparg I: Codeur Storie"); // la faute d'ortographe est faite exprès
		stage.setResizable(true);
		Canvas canvas = new Canvas();
		GaspargGraphics.canvas = canvas;
		GaspargGraphics.canvas.setWidth(800);
		GaspargGraphics.canvas.setHeight(600);
		pane.setCenter(canvas);
		stage.show();
		
		Runnable gameLoop = new Runnable() {

			@Override
			public void run() {
				Gasparg.INSTANCE.loop();
			}
			
		};
		Thread th = new Thread(gameLoop);
		th.setDaemon(true);
		th.start();
		stage.widthProperty().addListener((val, o, n) -> {
			GaspargGraphics.canvas.setScaleX(800 / n.doubleValue());
		});
		stage.heightProperty().addListener((val, o, n) -> {
			GaspargGraphics.canvas.setScaleX(800 / n.doubleValue());
		});
	}

}
