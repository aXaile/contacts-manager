package com.fredericboisguerin.insa;

public class Contact {
    private String name;
    private String email;
    private String phoneNumber;

    public Contact(String name,String email,String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        if (email==null) {
            return name + ", " + phoneNumber;
        } else {
            return name + ", " + email + ", " + phoneNumber;
        }
    }

    public boolean nameMatches(String pattern) {
        return this.name.toLowerCase().contains(pattern);

    }
}
