/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorgui;

import java.net.Socket;

/**
 *
 * @author albertonieto
 */
public class Hilo extends Thread{
    
    Socket socket;
    boolean cont = true;

    public Hilo(Socket socket) {
        this.socket = socket;
    }

    public Hilo() {
    }

    @Override
    public void run() {
        //Inicia el hilo
        
        do{
         
            
            
            
        }while(cont);
        


    }
    
    
    
}
