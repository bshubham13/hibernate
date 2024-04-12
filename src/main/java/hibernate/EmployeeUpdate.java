package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class EmployeeUpdate {

	public static void main(String[] args) {
//		Employee employee = new Employee();
//		employee.setId(5);
//		employee.setName("shubham");
//		employee.setPhone(9834109745L);
//		employee.setAddress("Mumbai");
//
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shubham");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		EntityTransaction transaction = entityManager.getTransaction();
//
//		Employee employee2 = entityManager.find(Employee.class, employee.getId());
//		if (employee2 != null) {
//			transaction.begin();
//			entityManager.merge(employee);
//			transaction.commit();
//		} else {
//			System.out.println("Id Not Found");
//		}
		
		
		
		
//		To change specific data 
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shubham");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Employee employee= entityManager.find(Employee.class, 1);
		if(employee!=null) {
			employee.setAddress("Pune");
			
			EntityTransaction entityTransaction= entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		else {
			System.out.println("Data Not Updated");
		}

	}
}
