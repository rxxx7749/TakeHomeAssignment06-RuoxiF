package com.example.android.tipcalculator;

import java.io.Serializable;


/**
 * Class to set and get the Tip information
 */
public class Tip implements Serializable {
    //declare the global variables
    private double total;
    private double salesTax;
    private double tip;
    private double grandTotal;

    /**
     * Constructor with instance variable total, salesTax, tip, grandTotal
     */
    public Tip(double total, double salesTax, double tip, double grandTotal) {
        this.total = total;
        this.salesTax = salesTax;
        this.tip = tip;
        this.grandTotal = grandTotal;
    }

    /**
     * Method to set value for variable total
     *
     * @param total
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * Method to set value for salesTax
     *
     * @param salesTax
     */
    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    /**
     * Method to set value for variable tip
     *
     * @param tip
     */
    public void setTip(double tip) {
        this.tip = tip;
    }

    /**
     * Method to set value for variable grandTotal
     *
     * @param grandTotal
     */
    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     * Method to get value of variable total
     *
     * @return total
     */
    public double getTotal() {
        return total;
    }

    /**
     * Method to get value of variable salesTax
     *
     * @return salesTax
     */
    public double getSalesTax() {
        return salesTax;
    }

    /**
     * Method to get value of variable tip
     *
     * @return tip
     */
    public double getTip() {
        return tip;
    }

    /**
     * Method to get value of variable grandTotal
     *
     * @return grandTotal
     */
    public double getGrandTotal() {
        return grandTotal;
    }

    @Override
    public String toString() {

        String str = "Total: " + this.total + "\nSales Tax: " + this.salesTax + "\nTip: "
        + this.tip + "\nGrand Total: " + this.grandTotal;
        return str;
    }
}

