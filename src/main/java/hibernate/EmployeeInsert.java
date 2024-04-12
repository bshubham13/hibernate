package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class EmployeeInsert {
	public static void main(String[] args) {
		
		Employee employee= new Employee();
		employee.setId(3);
		employee.setName("pratham");
		employee.setPhone(9882569745L);
		employee.setAddress("Solapur");
		
	EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("shubham"); 
	EntityManager entityManager = entityManagerFactory.createEntityManager(); 
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
   entityTransaction.begin();
   
   entityManager.persist(employee);
   
   entityTransaction.commit();
	
	
	}

}
