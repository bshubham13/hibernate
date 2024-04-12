package hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDelete {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shubham");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		Employee employee = entityManager.find(Employee.class, 0);
		if (employee != null) {
			transaction.begin();
			entityManager.remove(employee);
			transaction.commit();
		} else {
			System.out.println("Id Not found");
		}

	} 
}
