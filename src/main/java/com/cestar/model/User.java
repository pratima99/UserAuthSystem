package com.cestar.model;

public class User {
	
	private int id;
	private String username;
	private String password;
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
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	public User(String username, String password, String contact, String city, String email) {
		super();
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.city = city;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", contact=" + contact + ", city=" + city + ", email=" + email
				+ "]\n";
	}
	
}
