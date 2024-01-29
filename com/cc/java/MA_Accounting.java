package com.cc.java;

public class MA_Accounting extends SuperMitarbeiter {

    public MA_Accounting(String familyName, String firstName, int birthYear, String workID, String department,
            String role) {
        super(familyName, firstName, birthYear, workID, department, role);
   
    }

    public String doYourWork(){
        return ("Ich überprüfe jetzt die Bücher!");
    }



    

}
