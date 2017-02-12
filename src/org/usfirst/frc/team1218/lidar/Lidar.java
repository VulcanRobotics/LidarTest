package org.usfirst.frc.team1218.lidar;

import edu.wpi.first.wpilibj.I2C;

public class Lidar extends I2C {
	
	protected static final int defaultAddress = 0x62;
	

	public Lidar(Port port, int deviceAddress) {
		super(port, deviceAddress);
	}
	
	public Lidar(Port port){
		super(port,defaultAddress);
	}
	
	public int readDistance(){
		write(0x00,0x04);
		return bytesToInt(readByte(0x0F),readByte(0x10));
	}
	
	protected byte readByte(int registerAddress){
		byte[] buffer = new byte[1];
		read(registerAddress,buffer.length,buffer);
		return buffer[0];
		
	}
	
	public static byte intToByte(int input){
		return (byte) (input & 0xff);
	}
	
	public static int bytesToInt(byte high, byte low){
		int highByte = high & 0xff;
		int result = low & 0xff;
		result += (highByte << 8);
		return result;
	}
	
	public void writeByte(int address,byte code){
	}

}
