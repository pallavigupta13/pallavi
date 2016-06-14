package com.niit.shop.model;

public class user {
private String name;
private String password;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String validate()
{
	if ((name.equals("pallavi"))&&(password.equals("niit")))
			{ 
	return( "welcome" +this.getName());
			}
	else
	{
		return "Invalid";
	}
}
}



