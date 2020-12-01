package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contact {
    private String firstName;
    private String secondName;
    private List<ContactNumber> numbers;

    public Contact(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        numbers = new ArrayList<>();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public List<ContactNumber> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public void addNumber(ContactNumber contactNumber) {
        numbers.add(contactNumber);
    }

    @Override
    public String toString() {
        return firstName +
                " " + secondName +
                " " + numbers.toString();
    }
}
