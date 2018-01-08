package models;

import interfaces.Accomodation;

public class House{
	
	protected int mSize;
	protected float mPrice;

	public House() {
		super();
	}

	public House(int numberOfBed, float mPrice) {
		super();
		this.mSize = numberOfBed;
		this.mPrice = mPrice;
	}
	
	
}
