package models;

public class Villa extends House{
	private int mNumberOfBed;
	private float mPrice;
	
	public Villa(int mNumberOfBed, float price) {
		super();
		this.mNumberOfBed = mNumberOfBed;
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
		return mNumberOfBed;
	}

	public void setmNumberOfBed(int mNumberOfBed) {
		this.mNumberOfBed = mNumberOfBed;
	}

	public float getmPrice() {
		return mPrice;
	}

	public void setmPrice(float mPrice) {
		this.mPrice = mPrice;
	}

	@Override
	public String toString() {
		return "Villa [mNumberOfBed=" + mNumberOfBed + ", mPrice=" + mPrice + "]";
	}
	
	
	
	
	
}
