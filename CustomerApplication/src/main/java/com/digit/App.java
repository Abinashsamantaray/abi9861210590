package com.digit;

import com.digit.entity.Customer;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.transaction.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("entityManager");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Customer customer = new Customer("Rahul", 4, "9900182211");

        entityManager.getTransaction().begin();

        

        

        entityManager.persist(customer);

        entityManager.getTransaction().commit();

        System.out.println("Record Inserted");

        if(entityManager.getTransaction().isActive()) {
        	System.out.println("Transaction is active ");
        }
        else {
        	System.out.println("inactive ");
        }
        
        
        entityManager.close();

        entityManager.close();
    
    }
}
