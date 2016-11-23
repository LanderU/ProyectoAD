/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorgui;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author albertonieto
 */
public class ServidorGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
   
    int puerto =5500;
    ServerSocket server;
    Socket socket = new Socket();
    server = new ServerSocket(puerto);
    Hilo hilo;
    
    
    while(true){
        
          try{
            System.out.println("Servidor en espera...");
            socket = server.accept();
            System.out.println("Conexion aceptada!!!!");
            hilo = new Hilo(socket);
            hilo.start();
            
            
            
          }catch(Exception e){
              e.getMessage();
          }
        
        
    }
    
    
    
        
        
    
    }
    
}
