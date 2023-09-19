package chapter6project;

public class Bill {

    private String name;
    private String mobileNumber;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;
    private int overageMinutes;
    private double costPerMinute;
    private double subtotal;
    private double taxRate = 0.15;
    private double tax;
    private double total;


    //Default constructor
    public Bill(){
        name = " - ";
        mobileNumber = " - ";
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
        overageMinutes = 0;
        costPerMinute = 0;
        subtotal = 0;
        tax = 0;
        total = 0;
    }


    //ID only constructor
    public Bill(String name, String mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
        overageMinutes = 0;
        costPerMinute = 0;
        subtotal = 0;
        tax = 0;
        total = 0;
    }


    //Full bill constructor
    public Bill
    (String name, String mobileNumber, double baseCost, int allottedMinutes , int minutesUsed,
     int overageMinutes, double costPerMinute, double subtotal, double tax, double total)
    {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
        this.overageMinutes = overageMinutes;
        this.costPerMinute = costPerMinute;
        this.subtotal = subtotal;
        this.tax = tax;
        this.total = total;
    }


    //Getter & Setter for name
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }


    //Getter & Setter for mobileNumber
    String getMobileNumber(){
        return mobileNumber;
    }
    void setMobileNumber(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }


    //Getter & Setter for baseCost
    double getBaseCost(){
        return baseCost;
    }
    void setBaseCost(){
        this.baseCost = baseCost;
    }


    //Getter & Setter for allottedMinutes
    int getAllottedMinutes(){
        return allottedMinutes;
    }
    void setAllottedMinutes(){
        this.allottedMinutes = allottedMinutes;
    }


    //Getter & Setter for minutesUsed
    int getMinutesUsed(){
        return minutesUsed;
    }
    void setMinutesUsed(){
        this.minutesUsed = minutesUsed;
    }


    //Getter & Setter for costPerMinute
    double getCostPerMinute(){
        return costPerMinute;
    }
    void setCostPerMinute(){
        this.costPerMinute = costPerMinute;
    }


    //Calculations
    int calculateOverageMinutes(){
        if(minutesUsed > allottedMinutes){
            overageMinutes = minutesUsed - allottedMinutes;
            return overageMinutes;
        }
        else{
            overageMinutes = 0;
            return overageMinutes;
        }
    }
    double calculateSubtotal(){
        subtotal = baseCost + (overageMinutes * costPerMinute);
        return subtotal;
    }
    double calculateTax(){
        tax = subtotal * taxRate;
        return tax;
    }
    double calculateTotal(){
        total = subtotal + tax;
        return total;
    }
}
