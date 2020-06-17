import java.net.*;
import java.*;
public class ClientChat{
	public static void main(String[] args){
		Socket connessione = null;
		String server = "localhost";
		int port = 2345;
		InputStreamReader in, input;
		BufferedReader SIN, tastiera;
		OutputStream out;
		printWriter sOUT;
		String msgDalnviare;
		String msgRicevuto;
		try{
			connessione = new Socket(server, port);
			System.out.println(“Connessione eseguita.
		}catch(IOException e){
			System.out.println(e);
			System.exit(-1);
		}
		try{
			// flusso in ingresso da socket
			in = new InputStreamReader(connessione.getInputStream());
			SIN = new BufferedReader(in);
			// flusso in uscita su socket
			out = connessione.getOutputStream();
			SOUT = new PrintWriter(out);
			// flusso in ingresso da tastiera
			input = new InputStreamReader(System.in);
			tastiera = new BufferedReader(input);
			System.out.println("Chat inizializzata.");
			while (true){
				// legge il messaggio da tastiera
				msgDaInviare = tastiera.readLine();
				// interrompe la chat
				if (msgDaInviare.equals("FINE"))
					break;
				// invia il messaggio
				SOUT.println(msgDaInviare);
				SOUT.flush();
				// stampa il messaggio ricevuto
				msgRicevuto = sIN.readLine();
				System.out.println(">> " + msgRicevuto);
				}

		}catch (IOException e){
			system.out.println(e);
		}
		try{
			connessione. close();
		}
		catch (IOException e){
			system.out.println(e);
		}

	}
}