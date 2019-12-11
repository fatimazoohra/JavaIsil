package ServerClientSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ClientWorker implements Runnable {
	Socket clientSocket;
	public ClientWorker(Socket s) {
		this.clientSocket=s;
	}

	public void run() {
		try {
			PrintStream printStream = new PrintStream(clientSocket.getOutputStream() );
			InputStreamReader inputStream = new InputStreamReader(clientSocket.getInputStream());
			BufferedReader bufferedReader = new BufferedReader(inputStream);
			String message = null;
			message = bufferedReader.readLine();
			printStream.println(message );
			String messageSend = "serveur:"+message+"\n";
			printStream.println(messageSend );
			printStream.close();
		}catch(IOException ex){
			System.out.println("Serveur : probable d'nvoi du message");
		}
		
	}

}
