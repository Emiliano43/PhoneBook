package com.company;

public class ContactNumber {
    private final NumberType type;
    private final String number;

    public ContactNumber(NumberType type, String number) {

        this.type = type;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public NumberType getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " " + number;
    }

}
