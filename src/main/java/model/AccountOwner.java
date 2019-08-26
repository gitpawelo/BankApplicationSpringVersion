package model;

public class AccountOwner {


    private String name, lastname;
    private int PIN;

    public AccountOwner(String name, String lastname, int PIN){
        this.name = name;
        this.lastname = lastname;
        this.PIN = PIN;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getLastname(){
        return lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public int getPin(){
        return PIN;
    }

    public void setPin(int PIN){
        this.PIN = PIN;
    }
}
