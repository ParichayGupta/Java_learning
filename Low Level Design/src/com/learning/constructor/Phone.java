package com.learning.constructor;

public class Phone {
    /*
    * Copy Constructor Example
    * */

    private  int screanSize;
    private String brandName;
    private int modelNo;
    private int batterySize;
    private  int price;
    private  int ram;

    public Phone(int screanSize, String brandName, int modelNo, int batterySize, int price, int ram) {
        this.screanSize = screanSize;
        this.brandName = brandName;
        this.modelNo = modelNo;
        this.batterySize = batterySize;
        this.price = price;
        this.ram = ram;
    }

//    Copy Constructor
    /*
    *
    * Create a constructor and pass the Object name as param this is a copy constructor */
    public Phone(Phone phone){
        this.screanSize = phone.screanSize;
        this.brandName = phone.brandName;
        this.modelNo = phone.modelNo;
        this.batterySize = phone.batterySize;
        this.price = phone.price+10000;
        this.ram = phone.ram;
    }
}
