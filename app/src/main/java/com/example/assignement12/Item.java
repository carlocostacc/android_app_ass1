package com.example.assignement12;

public class Item {
    String counter_name;
    String value ;

    public Item(String counter_name, String value) {
        this.counter_name = counter_name;
        this.value = value;
    }

    public String getCounter_name() {
        return counter_name;
    }

    public void setCounter_name(String counter_name) {
        this.counter_name = counter_name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
