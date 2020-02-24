package com.util;

import org.hibernate.Query;
import org.hibernate.Session;

public class DataHelper 
{
  private Customer c;
  private HibernateUtil helper;
  private Session session;
  
 // private String username;
 // private String password;
  
  
  
    public DataHelper() 
    {
       // System.out.println(username);
       // System.out.println(password);
        this.session=helper.getSessionFactory().openSession();                
    }

   public void addCustomer(final String username,final String password,final String name,final String contact)
   {
    session.beginTransaction();
    c = new Customer(0, username, password, name, contact);
    session.save(c);
    session.getTransaction().commit();
    session.close();
   }
   
   public void checkLogin(final String login_username,final String login_password)
   {   
           session.beginTransaction();
           Query q =session.createQuery("FROM CUSTOMER as cust WHERE cust.username='" + login_username + "' AND cust.password='" + login_password + "'");
          
           if (!q.iterate().hasNext())
           {
                System.out.println("false");
                        
           } else {
                   
               System.out.print("true");
                 // response.sendRedirect("DisplayPage.jsp");      
                  }
      
                 
       
                   
   }
   }
           
           
  

