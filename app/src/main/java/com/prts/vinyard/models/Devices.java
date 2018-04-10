package com.prts.vinyard.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Devices{

	@SerializedName("Status")
	private String status;

	@SerializedName("DeviceGUID")
	private String deviceGUID;

	@SerializedName("Latitude")
	private double latitude;

	@SerializedName("Longitude")
	private double longitude;

	@SerializedName("Name")
	private String name;

	@SerializedName("BatteryVoltage")
	private int batteryVoltage;

	@SerializedName("VineyardGUID")
	private String vineyardGUID;

	@SerializedName("Type")
	private String type;

	@SerializedName("SoftwareVersion")
	private String softwareVersion;

	@SerializedName("SerialNumber")
	private String serialNumber;

	@SerializedName("SoftwareUpdatedOn")
	private String softwareUpdatedOn;

	@SerializedName("Sensors")
	private List<Sensors> sensors;

	@SerializedName("Alerts")
	private List<Alerts> alerts;

	@SerializedName("BlockNumber")
	private int blockNumber;

	@SerializedName("Notes")
	private String notes;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setDeviceGUID(String deviceGUID){
		this.deviceGUID = deviceGUID;
	}

	public String getDeviceGUID(){
		return deviceGUID;
	}

	public void setLatitude(double latitude){
		this.latitude = latitude;
	}

	public double getLatitude(){
		return latitude;
	}

	public void setLongitude(double longitude){
		this.longitude = longitude;
	}

	public double getLongitude(){
		return longitude;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setBatteryVoltage(int batteryVoltage){
		this.batteryVoltage = batteryVoltage;
	}

	public int getBatteryVoltage(){
		return batteryVoltage;
	}

	public void setVineyardGUID(String vineyardGUID){
		this.vineyardGUID = vineyardGUID;
	}

	public String getVineyardGUID(){
		return vineyardGUID;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setSoftwareVersion(String softwareVersion){
		this.softwareVersion = softwareVersion;
	}

	public String getSoftwareVersion(){
		return softwareVersion;
	}

	public void setSerialNumber(String serialNumber){
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber(){
		return serialNumber;
	}

	public void setSoftwareUpdatedOn(String softwareUpdatedOn){
		this.softwareUpdatedOn = softwareUpdatedOn;
	}

	public String getSoftwareUpdatedOn(){
		return softwareUpdatedOn;
	}

	public void setSensors(List<Sensors> sensors){
		this.sensors = sensors;
	}

	public List<Sensors> getSensors(){
		return sensors;
	}

	public void setAlerts(List<Alerts> alerts){
		this.alerts = alerts;
	}

	public List<Alerts> getAlerts(){
		return alerts;
	}

	public void setBlockNumber(int blockNumber){
		this.blockNumber = blockNumber;
	}

	public int getBlockNumber(){
		return blockNumber;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}

	public String getNotes(){
		return notes;
	}
}