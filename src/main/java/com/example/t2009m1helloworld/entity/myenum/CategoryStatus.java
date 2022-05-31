package com.example.t2009m1helloworld.entity.myenum;

public enum CategoryStatus {
    ACTIVE(1),DEACTIVE(0),DELETED(-1),UNDEFINED(-2);
    private int value;
    CategoryStatus(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static CategoryStatus getAccountStatus(int value){
        for(CategoryStatus categoryStatus : CategoryStatus.values()){
            if(categoryStatus.getValue() == value){
                return categoryStatus;
            }
        }
        return UNDEFINED;
    }
}
