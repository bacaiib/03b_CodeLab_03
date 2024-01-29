package com.cc.java;

public class MA_Production extends SuperMitarbeiter{

    public MA_Production(String familyName, String firstName, int birthYear, String workID, String department,
            String role) {
        super(familyName, firstName, birthYear, workID, department, role);
    
    }

        public String doYourWork(){
            return ("Ich produziere jetzt ein Produkt");
    }



}
