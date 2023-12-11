package com.mahesh.spring.validationDemo.model;

import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @NotNull(message = "is required")
    @Size(min=1,message="is required")
    private String lastName;


@Min(value=0,message = "must be >=0")
@Max(value=10,message = "must be<=10")
private int freePasses;
    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Yedava")
    private String postalCode;
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }



    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(int freePasses) {
        this.freePasses = freePasses;
    }

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


}
