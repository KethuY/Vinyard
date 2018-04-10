package com.prts.vinyard.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MenuItemOne {
    @SerializedName("VineyardGUID")
    private String vineyardGUID;

    @SerializedName("TimeZone")
    private String timeZone;

    @SerializedName("Blocks")
    private List<Blocks> blocks;

    @SerializedName("Subscription")
    private String subscription;

    @SerializedName("Devices")
    private List<Devices> devices;

    @SerializedName("Name")
    private String name;

    public void setVineyardGUID(String vineyardGUID){
        this.vineyardGUID = vineyardGUID;
    }

    public String getVineyardGUID(){
        return vineyardGUID;
    }

    public void setTimeZone(String timeZone){
        this.timeZone = timeZone;
    }

    public String getTimeZone(){
        return timeZone;
    }

    public void setBlocks(List<Blocks> blocks){
        this.blocks = blocks;
    }

    public List<Blocks> getBlocks(){
        return blocks;
    }

    public void setSubscription(String subscription){
        this.subscription = subscription;
    }

    public String getSubscription(){
        return subscription;
    }

    public void setDevices(List<Devices> devices){
        this.devices = devices;
    }

    public List<Devices> getDevices(){
        return devices;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
