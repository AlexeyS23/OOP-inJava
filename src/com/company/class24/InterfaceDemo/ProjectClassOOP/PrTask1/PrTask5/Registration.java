package com.company.class24.InterfaceDemo.ProjectClassOOP.PrTask1.PrTask5;
//Create Registration Class in which you would have variables as email,
//userName and password that have an access scope only within its own class.
//After creating an object of the class user should be able to call methods
//and in each method separately pass values to set users email, username and password.
//        Requirements:
// a. Valid email consider to be only yahoo
//b. Valid userName and password cannot be empty and should be of length larger than c. 6 characters.
// Also valid password cannot contain userName.
public class Registration {
   private String email;
   private String userName;
   private String password;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.contains("@yahoo.com")){
            this.email = email;
        }else{
            System.out.println("Wrong email address");
        }
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        if (userName.length()>6){
            this.userName = userName;
        }else {
            System.out.println("Not allowed");
        }
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        if (password.length()>6 && !password.equals(userName)){
            this.password = password;
        }else {
            System.out.println("Not allowed");
        }

    }
}
