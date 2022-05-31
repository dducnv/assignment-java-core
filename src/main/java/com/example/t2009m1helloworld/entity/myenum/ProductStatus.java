package com.example.t2009m1helloworld.entity.myenum;

public enum ProductStatus {
    ACTIVE(1),DEACTIVE(0),DELETED(-1),UNDEFINED(-2);
    private int value;
    ProductStatus(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
    public static ProductStatus getProductStatus(int value){
        for(ProductStatus accountStatus : ProductStatus.values()){
            if(accountStatus.getValue() == value){
                return accountStatus;
            }
        }
        return UNDEFINED;
    }
}
