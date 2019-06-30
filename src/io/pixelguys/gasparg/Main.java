package io.pixelguys.gasparg;

import io.pixelguys.gasparg.endpoint.ConsoleEndPoint;
import io.pixelguys.gasparg.endpoint.EndPoint;
import io.pixelguys.gasparg.game.Game;

public class Main {

	public static EndPoint endPoint;
	public static Game game;
	
	public static void main(String[] args) {
		String endpointText = "console"; // pas changer
		if (endpointText.equals("console")) {
			endPoint = new ConsoleEndPoint();
		}
		
		game = new Game();
		
		while (true) {
			String read = endPoint.read();
			game.process(read);
		}
	}

}
