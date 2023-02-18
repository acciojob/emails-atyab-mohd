package com.driver;

import javax.xml.stream.events.Characters;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(password)){
            if(newPassword.length() >= 8){
                if(upperCheck(newPassword) && lowerCheck(newPassword) && digitCheck(newPassword) && specialCheck(newPassword)){
                    password = newPassword;
                }
            }
        }
    }
    public boolean upperCheck(String pass){
        //if(pass == null) return false;
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') return true;
        }
        return false;
    }
    public boolean lowerCheck(String pass){
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z') return true;
        }
        return false;
    }
    public boolean digitCheck(String pass){
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9') return true;
        }
        return false;
    }
    public boolean specialCheck(String pass){
        for(int i=0;i<pass.length();i++){
            if(!(Character.isDigit(pass.charAt(i))) && !(Character.isAlphabetic(pass.charAt(i)))) return true;
        }
        return false;
    }
}
