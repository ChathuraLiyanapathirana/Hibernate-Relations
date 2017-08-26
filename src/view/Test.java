/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Customer;
import model.Orders;
import org.hibernate.classic.Session;
import util.HibernateUtil;

/**
 *
 * @author Chathura Buddhika
 */
public class Test {

    public static void main(String[] args) {
        Session openSession = HibernateUtil.getSessionFactory().openSession();
        openSession.beginTransaction();

        Customer c = new Customer();
        c.setCustId(1);
        c.setName("Chathura");
        
        Orders o=new Orders();
        o.setOrderId(1);
        o.setCustId(1);
        o.setCustomer(c);

        openSession.save(c);
        openSession.save(o);
        openSession.getTransaction().commit();
    }

}
