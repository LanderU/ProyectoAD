/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorftphilos;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author albertonieto
 */
public class HiloFTP extends Thread{
    
    Socket socket;
    ServerSocket server;
    boolean cont = true;

    public HiloFTP(Socket socket) {
        this.socket = socket;
    }

    public HiloFTP() {
    }

    @Override
    public void run() {
        try {
            
          //  do{
            
           
            System.out.println("Conexion aceptada");
            
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("Conexioln aceptada");
            
            
          //  }while(cont);
        } catch (IOException ex) {
            System.out.println("Error en el hiloSocket");
        }
        
        

    }
    
    
}
