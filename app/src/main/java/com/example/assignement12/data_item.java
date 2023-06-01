package com.example.assignement12;

public class data_item {
    String data_name;
    Integer data_amount;
    public data_item(String data_name, Integer data_amount) {
        this.data_name = data_name;
        this.data_amount = data_amount;

    }

    public String getEvent_name() {
        return data_name;
    }
    public String getData_amount(){return Integer.toString(data_amount);}

    public void setEvent_name(String data_name) {
        this.data_name = data_name;
    }

    public void setEvent_count(Integer data_amount) {this.data_amount = data_amount;}


}
