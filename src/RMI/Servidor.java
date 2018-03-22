/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;

/**
 *
 * @author gustavomiara
 */
public class Servidor {
    
    public JLabel jLabelPayer1;
    public JLabel jLabelPLayer2;
    public JProgressBar LifeBarPlayer1;
    public JProgressBar LifeBarPlayer2;
    public JTextArea jTextArea;

    public Servidor(JLabel jLabelPayer1, JLabel jLabelPLayer2, JProgressBar LifeBarPlayer1, JProgressBar LifeBarPlayer2, JTextArea jTextArea) {
        this.jLabelPayer1 = jLabelPayer1;
        this.jLabelPLayer2 = jLabelPLayer2;
        this.LifeBarPlayer1 = LifeBarPlayer1;
        this.LifeBarPlayer2 = LifeBarPlayer2;
        this.jTextArea = jTextArea;
    }
    
    
        public void run(){
        Servidor s = new Servidor(jLabelPayer1,jLabelPLayer2,LifeBarPlayer1, LifeBarPlayer2, jTextArea);
        
        try {
            
            Analisadora canal = (Analisadora) UnicastRemoteObject.exportObject((Remote) s,0);
            
            Registry registro = LocateRegistry.createRegistry(10000);            
            
            registro.bind("metodosAnalisadores", canal);
            
            System.out.println("Servidor pronto!");
            
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    
}
