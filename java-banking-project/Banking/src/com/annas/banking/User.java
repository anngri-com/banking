package com.annas.banking;

public class User {
	  private int userId; // primary key
	  private String username; // not null, unique
	  private String password; // not null
	  private String firstName; // not null
	  private String lastName; // not null
	  private String email; // not null
	  //private userAccount[] = {};
	  //private Role role;
	  
	  public User(String login, String password, String firstName, String lastName, String email) {
		  this.username = login;
		  this.password = password;
		  this.firstName = firstName;
		  this.lastName = lastName;
		  this.email = email;
	  }

	
	public void userInformation() {
		System.out.println("Name: " + this.firstName + this.lastName);
		System.out.println("Email address: " + this.email);
	}
	
	public String updateUserInfo(String... info) {
		
	}
	
	
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	}

