package com.springlearning.springpetclinic.model;


import java.time.LocalDate;

public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    boolean isUniqueChars(String str){
        if(str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for(int i = 0; i<str.length(); i++)
        {
            int val = str.charAt(i);
            if(char_set[val])
            {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
