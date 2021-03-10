package com.sumon.xyz.SpringBootThymeleafForm.model;


import javax.xml.crypto.Data;

public class User {
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;

    private boolean married;

    private Data birthday;


    public User() {

    }

    public User(String name, String email, String password, String gender, String note, String profession, boolean married, Data birthday) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.note = note;
        this.profession = profession;
        this.married = married;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public Data getBirthday() {
        return birthday;
    }

    public void setBirthday(Data birthday) {
        this.birthday = birthday;
    }

}
