package models;

import interfaces.Accomodation;

public class BeachHouse extends Accomodation{
	private int mSize;
	private String name;
	private float mPrice;
	
	public BeachHouse() {
		super();
		this.mPrice = 5;
	}
	
	
	public BeachHouse(float mPrice) {
		super();
		this.mPrice = 5;
	}



	public BeachHouse(int mNumOfBed,String name, float mPrice) {
		super();
		this.mSize = mNumOfBed;
		this.name = name;
		this.mPrice = mPrice;
	}
	public int getmNumOfBed() {
		return mSize;
	}
	public void setmNumOfBed(int mNumOfBed) {
		this.mSize = mNumOfBed;
	}
	
	public void setmPrice(float mPrice) {
		this.mPrice = mPrice;
	}
	@Override
	public String toString() {
		return "BeachHouse [mNumOfBed=" + mSize + ", mPrice=" + mPrice + "]";
	}


	@Override
	public float getPrice() {
		// TODO Auto-generated method stub
		return mPrice;
	}
	
	
	
	
}
