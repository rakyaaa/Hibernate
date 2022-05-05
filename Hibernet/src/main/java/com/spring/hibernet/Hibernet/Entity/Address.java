package com.spring.hibernet.Hibernet.Entity;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "Student_address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "address_id", length = 50)
	private int addressId;
	private String street;
	private String city;
	private boolean isOpen;
	@Transient // column will not be created in the table for this value
	private double pinCode;
	@Temporal(TemporalType.DATE) // use to format the date
	private Date addedDate;
	@Lob // large object file as the image will be large
	private byte[] image;
	
	public Address() {
		
	}

	public Address( String street, String city, boolean isOpen, double pinCode, Date addedDate) {
		super();
		
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.pinCode = pinCode;
		this.addedDate = addedDate;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getPinCode() {
		return pinCode;
	}

	public void setPinCode(double pinCode) {
		this.pinCode = pinCode;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", pinCode=" + pinCode + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
}
