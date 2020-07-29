package com.day2.practice;

 class Login {
	
	private String userName;
	 private String password;
	 public Login(String userName, String password) {
			super();
			this.userName = userName;
			this.password = password;
		}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	 public boolean validate() {
		 if(this.getUserName().equals("john")&& this.getPassword().equals("123abc"))
			 return true;
		 else
			 return false;
	 }

}
