package com.springlearning.springpetclinic.model;

public class Person extends BaseEntity {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    static String doubleChar(String s){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            builder.append(s.charAt(i)).append(s.charAt(i));
        }
        return builder.toString();
    }
}
