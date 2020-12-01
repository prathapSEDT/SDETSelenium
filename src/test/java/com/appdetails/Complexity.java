package com.appdetails;

public enum Complexity {
    TAX_RATE("0.15"),
    UserRole("Admin");
    private String value;
    Complexity(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }

}
