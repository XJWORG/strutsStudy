package com.test.action;

import java.util.Calendar;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private String username;
	private String password;
	private String repassword;
	private Integer age;
	private Date birthday;

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

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public Integer getAge() {
//		System.out.println("use setAge");
		return age;
	}

	public void setAge(Integer age) {
//		System.out.println("use getAge");
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

////	@Override
//	public String validateExecute() throws Exception {
//		System.out.println("Register Action Execute !");
//		return SUCCESS;
//
//	}

//	public String register() throws Exception 
//	{
//		System.out.println("valid method Register");
//		return SUCCESS;
//	}
	
//	public void validateRegister() throws Exception 
//	{
//		System.out.println("valid method ValidateRegisters");
////		this.addActionError("action Error test");
//	}
	

	@Override
	public String execute() throws Exception {

		return SUCCESS;
	}
	
	@Override
	public void validate() {
		System.out.println("use validate");
		if (null == this.username || null == this.username) {
			this.addFieldError("username",
					"username or password must not be null");
		} else if (username.length() < 6 || username.length() > 15) {
			this.addFieldError("username",
					"length of username should between 6 and 15");
		}

		if (password.length() < 6 || password.length() > 15) {
			this.addFieldError("password",
					"length of password should between 6 and 15");
		}

		if (null== this.age || this.age > 150 || this.age < 1) {
			this.addFieldError("age",
					"value of age should be between 1 and 150");
		}

		if (null == this.birthday) {
			this.addFieldError("birthday", "birthday must not be null");
		} else {

			Calendar birthday = Calendar.getInstance();
			birthday.setTime(this.birthday);

			Calendar today = Calendar.getInstance();
			today.setTime(today.getTime());

			if (birthday.after(today)) {
				this.addFieldError("birthday",
						"birthday cannot greater than today");
			}
		}
		
	}

}
