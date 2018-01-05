package models;

public class BeachHouse extends House{
	private int mNumOfBed;
	private float mPrice;
	
	public BeachHouse() {
		super();
		this.mPrice = 5;
	}
	
	
	public BeachHouse(float mPrice) {
		super();
		this.mPrice = 5;
	}



	public BeachHouse(int mNumOfBed, float mPrice) {
		super();
		this.mNumOfBed = mNumOfBed;
		this.mPrice = mPrice;
	}
	public int getmNumOfBed() {
		return mNumOfBed;
	}
	public void setmNumOfBed(int mNumOfBed) {
		this.mNumOfBed = mNumOfBed;
	}
	public float getmPrice() {
		return mPrice;
	}
	public void setmPrice(float mPrice) {
		this.mPrice = mPrice;
	}
	@Override
	public String toString() {
		return "BeachHouse [mNumOfBed=" + mNumOfBed + ", mPrice=" + mPrice + "]";
	}
	
	
	
	
}
