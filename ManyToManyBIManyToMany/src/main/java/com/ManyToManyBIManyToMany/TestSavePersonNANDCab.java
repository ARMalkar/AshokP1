package com.ManyToManyBIManyToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonNANDCab
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person1=new Person();
		person1.setName("Ashok");
		person1.setAge(25);
		person1.setGender("male");
		person1.setPhno(1234567890l);
		
		Person person2=new Person();
		person2.setName("Akash");
		person2.setAge(26);
		person2.setGender("male");
		person2.setPhno(1546767890l);
		
		Person person3=new Person();
		person3.setName("Aish");
		person3.setAge(28);
		person3.setGender("Female");
		person3.setPhno(54678787890l);
		
		Cab cab1=new Cab();
		cab1.setDname("Darshon");
		cab1.setPhno(5465374689986l);
		cab1.setCost(450.76);
		cab1.setType("non-Ac");
		
		Cab cab2=new Cab();
		cab2.setDname("Mohan");
		cab2.setPhno(554129986l);
		cab2.setCost(3232.76);
		cab2.setType("Ac");
		
		Cab cab3=new Cab();
		cab3.setDname("Nagesh");
		cab3.setPhno(54253589986l);
		cab3.setCost(550.76);
		cab3.setType("non-Ac");
		
		Cab cab4=new Cab();
		cab4.setDname("Manoj");
		cab4.setPhno(25815686l);
		cab4.setCost(400.76);
		cab4.setType("non-Ac");
		 
		Cab cab5=new Cab();
		cab5.setDname("Guru");
		cab5.setPhno(54686236l);
		cab5.setCost(350.76);
		cab5.setType("non-Ac");
		
		List<Person> list1=new ArrayList<Person>();
		list1.add(person1);
		list1.add(person2);
		
		List<Person> list2=new ArrayList<Person>();
		list2.add(person2);
		list2.add(person3);
		
		List<Cab>list3=new ArrayList<Cab>();
		list3.add(cab1);
		list3.add(cab2);
		list3.add(cab3);
		
		List<Cab>list4=new ArrayList<Cab>();
		list4.add(cab3);
		list4.add(cab4);
		list4.add(cab5);
		
		List<Cab>list5=new ArrayList<Cab>();
		list5.add(cab1);
		list5.add(cab5);
		list5.add(cab4);
		

		person1.setCabs(list3);
		person2.setCabs(list4);
		person3.setCabs(list5);
		
		cab1.setPersons(list1);
		cab2.setPersons(list2);
		cab3.setPersons(list1);
		cab4.setPersons(list2);
		cab5.setPersons(list1);
		
		entityTransaction.begin();
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(person3);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		entityManager.persist(cab3);
		entityManager.persist(cab4);
		entityManager.persist(cab5);
		entityTransaction.commit();
		
	}
}
