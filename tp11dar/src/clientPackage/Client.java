package clientPackage;
import java.net.*;
import java.io.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//etape1 : connexion au serveur localhost sur le port 1234
			Socket socket =new Socket ("localhost",1234);
			System.out.println("je suis connecte au serveur ");
			 // etape2 : Envoyer un nombre au serveur 
			OutputStream os = socket.getOutputStream();
			os.write(5); 
			
			// etpe3 : lire la réponse du serveur
			InputStream is = socket.getInputStream();
			int nb = is.read();
			
			//etape4 : afficher le resultat
		    System.out.println("la  multplication de 5 est : " +nb);
		    
		    //etape5 : fermer la connexion 
		    socket.close();
		}catch
			(IOException e) {
	            e.printStackTrace();
		}

	
	}
}

