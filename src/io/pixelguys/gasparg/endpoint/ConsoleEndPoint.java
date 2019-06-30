package io.pixelguys.gasparg.endpoint;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleEndPoint extends EndPoint {

	private static final PrintStream out = System.out;
	private static final Scanner     in  = new Scanner(System.in);
	
	public ConsoleEndPoint() {
		out.println("-- Lancement du jeu --");
		out.println();
	}

	@Override
	public void write(Object obj) {
		out.println(obj);
	}

	@Override
	public void notification(Object obj) {
		out.println("Notification: " + obj);
	}

	@Override
	public void debug(Object obj) {
		out.println("(Debug) " + obj);
	}

	@Override
	public String read() {
		out.print(" > ");
		return in.nextLine();
	}

	@Override
	public void close() throws IOException {
		out.close();
		in.close();
	}
	
}
