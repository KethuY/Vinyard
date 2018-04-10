package com.prts.vinyard.models;

import com.google.gson.annotations.SerializedName;

public class MenuItemTwo {

    @SerializedName("Status")
    private String status;

    @SerializedName("Value")
    private String value;

    @SerializedName("BlockNumber")
    private String blockNumber;

    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }

    public void setValue(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public void setBlockNumber(String blockNumber){
        this.blockNumber = blockNumber;
    }

    public String getBlockNumber(){
        return blockNumber;
    }
}
