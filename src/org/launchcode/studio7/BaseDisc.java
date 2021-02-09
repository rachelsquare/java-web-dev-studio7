package org.launchcode.studio7;

public class BaseDisc {

    public double writeSpeed;
    public String dataType;
    public double storageCapacity;
    public double storageUtilization;
    public String discType;

    public BaseDisc(double aWriteSpeed, String aDataType, double aStorageCapacity, double aStorageUtilization, String aDiscType){
        writeSpeed = aWriteSpeed;
        dataType = aDataType;
        storageCapacity = aStorageCapacity;


    }
    public double getWriteSpeed(){
        return writeSpeed;
    }

    public String getDataType(){
        return dataType;
    }

    public double getStorageCapacity(){
        return storageCapacity;
    }

    public double getStorageUtilization(){
        return storageUtilization;
    }

    public void setStorageUtilization(){
        this.storageUtilization = storageUtilization;
    }

    public String getDiscType(){
        return discType;
    }

}