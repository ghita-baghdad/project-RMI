/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.MachineService;
import services.SalleService;

/**
 *
 * @author Lenovo
 */
public class Server {

    public static void main(String[] args) {

        try {
            IDao<Machine> dao = new MachineService();
            LocateRegistry.createRegistry(1099);
            Naming.bind("rmi://localhost:1099/dao", dao);
            System.out.println("En attente de la connexion des clients");
            
            
            IDao<Salle> dao1 =  new SalleService();
            Naming.bind("rmi://localhost:1099/dao1", dao1);
            System.out.println("En attente de la connexion 2 des clients");
                  
            
            
        } catch (AlreadyBoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
