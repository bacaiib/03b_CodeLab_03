package com.cc.java;

public class SuperMitarbeiter {

    private String familyName;
    private String firstName;
    private int birthYear;
    protected String workID;
    protected String department;
    protected String role;

    

    public SuperMitarbeiter(String familyName, String firstName, int birthYear, String workID, String department,
            String role) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
    }

    public void setFamilyName(String familyName){
        this.familyName = familyName;
    }

    public String getFamilyName(){
        return familyName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    

    public void hasLunch(){
        System.out.println("Hi mein Name ist "+firstName+familyName+" ich gehe jetzt was essen!");
    }

    protected void startsWork(){
       System.out.println("Hi ich bin "+firstName+familyName+" und ich fange an zu arbeiten!");
    }

}
