package serverPackage;
import java.net.*;
import java.io.*;

public class Server {

	public static void main(String[] args) throws IOException {
		try {
            // Étape 1 : Création du ServerSocket (port 1234)
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Le serveur attend la connexion d'un client...");

            // Étape 2 : Attente de connexion du client
            Socket socket = serverSocket.accept();
            System.out.println("Un client est connecté ");

            // Étape 3 : Récupérer les flux de communication
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            // Étape 4 : Lire un nombre envoyé par le client
            int x = is.read();
            System.out.println("Nombre reçu du client : " + x);

            // Étape 5 : Calculer et renvoyer la valeur x * 5
            int result = x * 5;
            os.write(result);
            System.out.println("Résultat envoyé au client : " + result);

            // Étape 6 : Fermer les connexions
            socket.close();
            serverSocket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

		

	}
