package com.example.petshop;

import java.util.Date;
public abstract class Pet implements Pettable {
    private String name;
    private Date birthDate;

    public Pet(String name) {
        this.name = name;
    }

    public Pet(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract String speak();

    public Void pet() {
        return null;
    }
}
