package com.company;

public abstract class TaxPayer {
    protected int percentage;
    protected int salary;

    protected TaxPayer(int percentage, int salary){
        this.percentage = percentage;
        this.salary = salary;
    }

    void calculateTax(){
        salary = salary * percentage;
    }
}
