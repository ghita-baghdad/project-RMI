/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;
import entities.Machine;
import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.MachineService;
import services.SalleService;


import util.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class Test1 {

    public static void main(String[] args) throws RemoteException {
////        try {
//          HibernateUtil.getSessionFactory() ;
            IDao<Machine> dao = new MachineService();
                  IDao<Salle> dao1 = (IDao<Salle>) new SalleService();
 
//            dao1.create(new Salle("PR_CODE")) ;
//            dao1.create(new Salle("DE_CODE")) ;
//            dao1.create(new Salle("TR_CODE")) ;
//            dao1.create(new Salle("QU_CODE")) ;
//            dao1.create(new Salle("CI_CODE")) ;
            
           
//            for (Salle s : dao1.findAll()){
//     
//                System.out.println(s);
//            
//            }
            dao.delete(new Machine("ER44", "Dell", 1200, dao1.findById(1)));
//            dao.create(new Machine("ER44", "Dell", 1200, dao1.findById(1)));
//            dao.create(new Machine("ER45", "Lenovo", 5600, dao1.findById(3)));
//            dao.create(new Machine("ER46", "Asus", 1260,dao1.findById(2)));
//            dao.create(new Machine("ER47", "Acer", 1900,dao1.findById(1)));
            for (Machine m : dao.findAll()){
     
                System.out.println(m);
            
            }
//        } catch (RemoteException ex) {
//            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
//        }

//  }

}
}