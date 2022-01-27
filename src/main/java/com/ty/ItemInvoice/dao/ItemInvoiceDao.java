package com.ty.ItemInvoice.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.ItemAndInvoice.Invoice;
import com.ty.ItemAndInvoice.Item;


public class ItemInvoiceDao {
EntityManagerFactory entityManagerFactory=null;
EntityManager entityManager=null;
EntityTransaction entityTransaction=null;

public EntityManager getEntityManager() {
	entityManagerFactory=Persistence.createEntityManagerFactory("build");
	return entityManager=entityManagerFactory.createEntityManager();
	
}

public void saveItem(Item item,Invoice invoice)
{
entityManager=getEntityManager();
entityTransaction=entityManager.getTransaction();
entityTransaction.begin();
entityManager.persist(item);
entityManager.persist(invoice);

}
public void deleteInvoiceAndItem(int id)
{
entityManager=getEntityManager();
entityTransaction=entityManager.getTransaction();
entityTransaction.begin();
Invoice invoice=entityManager.find(Invoice.class,id);
if(invoice!=null) {
	Item item=invoice.getItem();
	entityManager.remove(invoice);
	if(item!=null) {
		entityManager.remove(item);
		entityTransaction.commit();
	}
}
}
public void updateInvoice(Invoice invoice) {
	entityManager=getEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(invoice);
	entityTransaction.commit();
}
public void updateItem(Item item) {
	entityManager=getEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.merge(item);
	entityTransaction.commit();
}
public void getInvoice(int id)
{
	entityManager=getEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	Invoice invoice=entityManager.find(Invoice.class,id);
	if(invoice!=null)
		invoice.getId();
		invoice.getName();
		invoice.getBillingaddress();
		invoice.getName();
		invoice.getTax();
		
		Item item=invoice.getItem();
		item.getId();
		item.getName();
		item.getCost();
		item.getQuantity();
	
}
}
