package com.cestar.model;

public class User {
	
	private int id;
	private String userName;
	private String contact;
	private String city;
	private String email;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, String userName, String contact, String city, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.contact = contact;
		this.city = city;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", contact=" + contact + ", city=" + city + ", email=" + email
				+ "]\n";
	}
	

	
}
