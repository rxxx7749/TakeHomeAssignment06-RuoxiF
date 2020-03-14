package com.example.android.tipcalculator;

import java.io.Serializable;


/**
 * Class to set and get the Tip information
 */
public class Tip implements Serializable {
    //declare the global variables
    private String total;
    private String salesTax;
    private String tip;
    private String grandTotal;

    /**
     * Constructor with instance variable total, salesTax, tip, grandTotal
     */
    public Tip(String total, String salesTax, String tip, String grandTotal) {
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
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * Method to set value for salesTax
     *
     * @param salesTax
     */
    public void setSalesTax(String salesTax) {
        this.salesTax = salesTax;
    }

    /**
     * Method to set value for variable tip
     *
     * @param tip
     */
    public void setTip(String tip) {
        this.tip = tip;
    }

    /**
     * Method to set value for variable grandTotal
     *
     * @param grandTotal
     */
    public void setGrandTotal(String grandTotal) {
        this.grandTotal = grandTotal;
    }

    /**
     * Method to get value of variable total
     *
     * @return total
     */
    public String getTotal() {
        return total;
    }

    /**
     * Method to get value of variable salesTax
     *
     * @return salesTax
     */
    public String getSalesTax() {
        return salesTax;
    }

    /**
     * Method to get value of variable tip
     *
     * @return tip
     */
    public String getTip() {
        return tip;
    }

    /**
     * Method to get value of variable grandTotal
     *
     * @return grandTotal
     */
    public String getGrandTotal() {
        return grandTotal;
    }

    @Override
    public String toString() {

        String str = "Total: " + this.total + "\nSales Tax: " + this.salesTax + "\nTip: "
        + this.tip + "\nGrand Total: " + this.grandTotal;
        return str;
    }
}

