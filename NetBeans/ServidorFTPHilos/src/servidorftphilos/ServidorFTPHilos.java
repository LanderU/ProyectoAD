/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorftphilos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author albertonieto
 */
public class ServidorFTPHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        int puerto = 5500;
        ServerSocket server = new ServerSocket(puerto);
        Socket socket = null;
        boolean cont = true;
        DataOutputStream dataOut;
        DataInputStream dataIn;
        int opcion = 0;
        File[] archivos = new File[100];

        System.out.println("Servidor esperando....");

       // do {
        socket = server.accept();
            HiloFTP hilo = new HiloFTP(socket);
            hilo.start();
            System.out.println("Conexion redirigida a hilo...");

      //  } while (cont);

    }

}
