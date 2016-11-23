/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorftphilos;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author albertonieto
 */
public class ClienteFTPHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
    
    
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        InetAddress direccion = InetAddress.getLocalHost();
        int puerto = 5500;
        Socket socket;
        DataInputStream in;
        DataOutputStream dataOut;
        int opcion = 0;
        boolean cont = true;

    
        do{
            //Iniciamos la conexion con el servidor a traves del socket
            socket = new Socket(direccion, puerto);
            in = new DataInputStream(socket.getInputStream());
            System.out.println(in.readUTF());
            
        System.out.println("--------------Elige una opción---------------------\n"
                        + "\n1->Listar archivos disponibles en el servidor.\n"
                        + "2->Cargar un archivo al servidor\n"
                        + "3->Descargar un archivo del servidor.\n"
                        + "4->Salir.\n"
                        +"________________________________________________________________"
                        + "\n");
           
        //Recogemos la opcion y controlamos el resultado y las posibles excepciones!!
       do {
                try {
                    System.out.print("Elige una opcion:");
                    opcion = Integer.parseInt(br.readLine());

                    if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
                        cont = false;
                    } else {
                        System.out.println("Numero del 1 al 4!!!");
                        cont = true;
                    }

                } catch (Exception e) {
                    System.out.println("Escribe un numero del 1 al 4 y no vengas a joder!!!!!");
                    cont = true;
                }
            }while (cont);
        
        
        
        }while(opcion!=4);
    
    }
    
}
