package com.OneToManyBIManyToOne;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveCustomerANDBank 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Customer customer1=new Customer();
		customer1.setCname("Ashok");
		customer1.setAge(25);
		customer1.setPhno(7829693112l);
		customer1.setAddess("Bengaluru");
		
		Customer customer2=new Customer();
		customer2.setCname("Akash");
		customer2.setAge(26);
		customer2.setPhno(9972163758l);
		customer2.setAddess("Mysore");
		
		Customer customer3=new Customer();
		customer3.setCname("Avinash");
		customer3.setAge(24);
		customer3.setPhno(782958712l);
		customer3.setAddess("Gulbarga");
		
		Bank bank1=new Bank();
		bank1.setBname("CANARA");
		bank1.setLocation("Bengaluru");
		bank1.setNoBranch(25);
		bank1.setPhno(1145182585481l);
		
		Bank bank2=new Bank();
		bank2.setBname("SBI");
		bank2.setLocation("Bengaluru");
		bank2.setNoBranch(50);
		bank2.setPhno(4526585481l);
		
		Bank bank3=new Bank();
		bank3.setBname("HDFC");
		bank3.setLocation("Mysore");
		bank3.setNoBranch(30);
		bank3.setPhno(11658781l);
		
		Bank bank4=new Bank();
		bank4.setBname("IOB");
		bank4.setLocation("Mysore");
		bank4.setNoBranch(15);
		bank4.setPhno(11232585481l);

		Bank bank5=new Bank();
		bank5.setBname("Corporation");
		bank5.setLocation("Gulbarga");
		bank5.setNoBranch(20);
		bank5.setPhno(11657775481l);
		
		Bank bank6=new Bank();
		bank6.setBname("BOB");
		bank6.setLocation("Gulbarga");
		bank6.setNoBranch(25);
		bank6.setPhno(111355481l);
		
		
		List<Bank> list1=new ArrayList<Bank>();
		list1.add(bank1);
		list1.add(bank2);
		
		List<Bank> list2=new ArrayList<Bank>();
		list2.add(bank3);
		list2.add(bank4);
		
		List<Bank> list3=new ArrayList<Bank>();
		list3.add(bank5);
		list3.add(bank6);
		
		customer1.setBanks(list3);
		customer2.setBanks(list2);
		customer3.setBanks(list1);
		
		bank1.setCustomers(customer1);
		bank2.setCustomers(customer1);
		bank3.setCustomers(customer2);
		bank4.setCustomers(customer2);
		bank5.setCustomers(customer3);
		bank6.setCustomers(customer3);
		
		entityTransaction.begin();
		entityManager.persist(customer1);
		entityManager.persist(customer2);
		entityManager.persist(customer3);
		entityTransaction.commit();

	}
}
