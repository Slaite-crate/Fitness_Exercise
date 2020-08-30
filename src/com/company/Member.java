package com.company;

public class Member extends Person {
    private boolean isBasic;

    public Member(boolean isBasic) {
        this.isBasic = isBasic;
    }

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(){
        String memberType;
        if (isBasic == true){
            memberType = "Basic";
        } else {
            memberType = "Full";
        }
        return memberType;
    }

    public int monthlyFee(){
        int fee;
        if (isBasic == true){
            fee = 199;
        } else {
            fee = 299;
        }
        return fee;
    }
}
