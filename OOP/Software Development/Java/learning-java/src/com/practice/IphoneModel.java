package com.practice;



public enum IphoneModel {

    // Enum constants for IPhone
    IPHONE_7_PLUS("Iphone 7+"),
    IPHONE_7("Iphone 7"),
    IPHONE_X("Iphone X");

    private String modelStr;

    IphoneModel(String modelStr) {
        this.modelStr = modelStr;
    }

    public String getModelStr() {
        return modelStr;
    }
}
