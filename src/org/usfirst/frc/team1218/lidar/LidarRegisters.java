package org.usfirst.frc.team1218.lidar;

public enum LidarRegisters {
	deviceControl(0x00),
	deviceStatus(0x01),
	maxiumAcquisitionLimit(0x02),
	acquisitionControll(0x04),
	velocity(0x09),
	peakCorrelation(0x0c),
	noise(0x0d),
	signalStrength(0x0e),
	distanceHigh(0x0f),
	distanceLow(0x10),
	burstCountControl(0x11),
	refrenceAcquisitionCount(0x12),
	previousDistanceHigh(0x14),
	previousDistanceLow(0x15),
	uniqueIdHigh(0x16),
	uniqueIdLow(0x17),
	I2CAddressUnlockHigh(0x18),
	I2CAddressUnlockLow(0x19),
	I2CAddress(0x1a),
	peakDetectionControl(0x1b),
	I2CConfig(0x1c);
	
	
	protected int address;
	LidarRegisters(int address){
		this.address = address;
	}
	
	public int getAddress(){
		return this.address;
	}
}
