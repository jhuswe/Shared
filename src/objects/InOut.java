package objects;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;

public class InOut {
	public PrintWriter out;
	public BufferedReader in;
	public Player player;
	public Socket socket;
	
	public InOut(BufferedReader in, PrintWriter out, Socket socket) {
		this.in = in;
		this.out = out;
		this.socket = socket;
	}
}
