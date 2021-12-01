package com.example.project.model;

public class LoginChecker {
    UserDB userDB;
    int username;
    int password;
    String Lname;
    String Fname;
    String phoneNumber;
    String email;
    String sex;
    String birthDate;
    String activationDate;
    String permission;
    int flag = -1;

    public LoginChecker(int username, int password) {
        userDB = new UserDB();
        setUsername(username);
        setPassword(password);
    }

    public int checkUsernamePassword() {
        flag = userDB.validateUser(username, password);
        if (flag == 1) setUserInfo();
        return flag;

    }

    public String setUserInfo() {
        setLname((userDB.getUserInfo(username, password, "Lname")));
        setFname((userDB.getUserInfo(username, password, "Fname")));
        setPhoneNumber(userDB.getUserInfo(username, password, "Phone"));
        setEmail(userDB.getUserInfo(username, password, "Email"));
        setSex(userDB.getUserInfo(username, password, "Sex"));
        setBirthDate(userDB.getUserInfo(username, password, "Date_B"));
        setActivationDate(userDB.getUserInfo(username, password, "ActivationDate"));
        setPermission(userDB.getPermissionType(username));
        return "";
    }

    public String getLname() {
        return Lname;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFname() {
        return Fname;
    }


    public void setFname(String fname) {
        Fname = fname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(String activationDate) {
        this.activationDate = activationDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        if (flag == 0) return "UserName or Pass is Not Valid";
        return "User {" +
                "UserName= " + this.getUsername() +
                ", LastName= '" + this.getLname() + '\'' +
                ", FirstName= '" + this.getFname() + '\'' +
                ", Password= '" + this.getPassword() + '\'' +
                ", Phone= '" + this.getPhoneNumber() + '\'' +
                ", Email= '" + this.getEmail() + '\'' +
                ", Sex= '" + this.getSex() + '\'' +
                ", BirthDate= '" + this.getBirthDate() + '\'' +
                ", ActivationDate= '" + this.getActivationDate() + '\'' +
                ", Permission= '" + this.getPermission() + '\'' +
                '}';
    }
}