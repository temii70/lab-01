package com.example.petshop;

import java.util.Date;

public abstract class Pet { //pet is now the parent class
    private String name;
    private Date birthDate;

    public Pet(String name) {
        this.name = name; //java thinks both names refer to parameters not the fields
        //so we need this to differientate them
        this.birthDate = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    //constructor has NO return types
    public Pet(Date birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name; //set objects name to the value passed in

    }

        public abstract String speak();


}



