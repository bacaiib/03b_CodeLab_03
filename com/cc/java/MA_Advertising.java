package com.cc.java;

public class MA_Advertising extends SuperMitarbeiter {

    public MA_Advertising(String familyName, String firstName, int birthYear, String workID, String department,
            String role) {
        super(familyName, firstName, birthYear, workID, department, role);
   
    }

    public String doYourWork(){
        return ("Ich gehe jetzt auf die straße und promote unser Unternehmen");
    }

}
