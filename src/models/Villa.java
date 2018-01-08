package models;

import interfaces.Accomodation;

public class Villa extends Accomodation{
	private int mSize;
	private float mPrice;
	
	public Villa(int mNumberOfBed, float price) {
		super();
		this.mSize = mNumberOfBed;
		this.mPrice = price;
	}
	
	
	public Villa(float mPrice) {
		super();
		this.mPrice = 10;
	}

	public Villa() {
		super();
		this.mPrice = 10;
	}

	public int getmNumberOfBed() {
		return mSize;
	}

	public void setmNumberOfBed(int mNumberOfBed) {
		this.mSize = mNumberOfBed;
	}


	public void setmPrice(float mPrice) {
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "Villa [mNumberOfBed=" + mSize + ", mPrice=" + mPrice + "]";
	}

	@Override
	public float getPrice() {
		return mPrice;
	}
	
	
	
	
	
}
