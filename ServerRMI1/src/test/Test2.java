/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.IDao;

import entities.Salle;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import services.SalleService;


/**
 *
 * @author Lenovo
 */
public class Test2 {
    
        public static void main(String[] args) {
        try {
            //HibernateUtil.getSessionFactory() ;
            IDao<Salle> dao = (IDao<Salle>) new SalleService();
 
            dao.create(new Salle("PR_CODE")) ;
            dao.create(new Salle("DE_CODE")) ;
            dao.create(new Salle("TR_CODE")) ;
            dao.create(new Salle("QU_CODE")) ;
            dao.create(new Salle("CI_CODE")) ;
            
           
            for (Salle s : dao.findAll()){
     
                System.out.println(s);
            
            }
        } catch (RemoteException ex) {
            Logger.getLogger(Test2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
