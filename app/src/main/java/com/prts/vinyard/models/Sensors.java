package com.prts.vinyard.models;

import com.google.gson.annotations.SerializedName;

public class Sensors{

	@SerializedName("Status")
	private String status;

	@SerializedName("SensorId")
	private int sensorId;

	@SerializedName("SensorType")
	private String sensorType;

	@SerializedName("VineyardGUID")
	private Object vineyardGUID;

	@SerializedName("DeviceGUID")
	private String deviceGUID;

	@SerializedName("ReportingInterval")
	private int reportingInterval;

	@SerializedName("Symbol")
	private String symbol;

	@SerializedName("Value")
	private Object value;

	@SerializedName("Driver")
	private String driver;

	@SerializedName("DriverUpdatedOn")
	private String driverUpdatedOn;

	@SerializedName("Notes")
	private String notes;

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setSensorId(int sensorId){
		this.sensorId = sensorId;
	}

	public int getSensorId(){
		return sensorId;
	}

	public void setSensorType(String sensorType){
		this.sensorType = sensorType;
	}

	public String getSensorType(){
		return sensorType;
	}

	public void setVineyardGUID(Object vineyardGUID){
		this.vineyardGUID = vineyardGUID;
	}

	public Object getVineyardGUID(){
		return vineyardGUID;
	}

	public void setDeviceGUID(String deviceGUID){
		this.deviceGUID = deviceGUID;
	}

	public String getDeviceGUID(){
		return deviceGUID;
	}

	public void setReportingInterval(int reportingInterval){
		this.reportingInterval = reportingInterval;
	}

	public int getReportingInterval(){
		return reportingInterval;
	}

	public void setSymbol(String symbol){
		this.symbol = symbol;
	}

	public String getSymbol(){
		return symbol;
	}

	public void setValue(Object value){
		this.value = value;
	}

	public Object getValue(){
		return value;
	}

	public void setDriver(String driver){
		this.driver = driver;
	}

	public String getDriver(){
		return driver;
	}

	public void setDriverUpdatedOn(String driverUpdatedOn){
		this.driverUpdatedOn = driverUpdatedOn;
	}

	public String getDriverUpdatedOn(){
		return driverUpdatedOn;
	}

	public void setNotes(String notes){
		this.notes = notes;
	}

	public String getNotes(){
		return notes;
	}

}