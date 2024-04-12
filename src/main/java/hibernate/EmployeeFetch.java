package hibernate;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lombok.ToString;

public class EmployeeFetch {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("shubham");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		
		Employee employee=entityManager.find(Employee.class, 1);  
		//pass primary key along with emp class cuz it fetch data based on primary key
		
		if(employee != null)
		{
			System.out.println(employee);
		}
		else {
			System.out.println("Data does not exist");
		}
//		System.out.println(employee.getId());
//		System.out.println(employee.getName());
//		System.out.println(employee.getPhone());
//		System.out.println(employee.getAddress());
	}

}
