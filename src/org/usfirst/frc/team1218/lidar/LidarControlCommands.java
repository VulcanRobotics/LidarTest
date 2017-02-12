package org.usfirst.frc.team1218.lidar;

public enum LidarControlCommands {
	reset(0x00),
	acquireDistanceWithoutBiasCorrection(0x03),
	acquireDistance(0x04);
	
	protected int code;
	
	LidarControlCommands(int code){
		this.code = code;
	}
	
	public int getCommandCode(){
		return code;
	}
}
