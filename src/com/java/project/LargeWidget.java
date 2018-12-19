package com.java.project;

public class LargeWidget extends Widget {
	public LargeWidget(SurfaceColor color) {super (color); 
	this.serialNumber = SerialNumber.getInstance()
			.getNextSerial(SerialNumber.ProductType.LargeWidget); }


	@Override
	public String getGears() {
		return "9 Gears";
	}

	@Override
	public String getSprings() {
		// TODO Auto-generated method stub
		return "4 Springs";
	}

	@Override
	public String getLevers() {
		// TODO Auto-generated method stub
		return "2 Lever";
	}
	
}
