package com.ty.ItemAndInvoice;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Invoice {
	@Id
private int id;
private String billingaddress;
private String name;
private String gstno;
private double tax;

@OneToOne
Item item;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getBillingaddress() {
	return billingaddress;
}

public void setBillingaddress(String billingaddress) {
	this.billingaddress = billingaddress;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGstno() {
	return gstno;
}

public void setGstno(String gstno) {
	this.gstno = gstno;
}

public double getTax() {
	return tax;
}

public void setTax(double tax) {
	this.tax = tax;
}

public Item getItem() {
	return item;
}

public void setItem(Item item) {
	this.item = item;
}

}
