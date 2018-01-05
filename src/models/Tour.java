package models;

public class Tour {
	private String mName;
	private float mPrice;
	private String mStartDate;
	private String mEndDate;
	private String mInformation;
	
	public Tour() {}
	
	
	public Tour(float mPrice, String mStartDate, String mEndDate, String mInformation) {
		super();
		this.mPrice = mPrice;
		this.mStartDate = mStartDate;
		this.mEndDate = mEndDate;
		this.mInformation = mInformation;
	}


	public Tour(String mName, float mPrice, String mStartDate, String mEndDate, String mInformation) {
		super();
		this.mName = mName;
		this.mPrice = mPrice;
		this.mStartDate = mStartDate;
		this.mEndDate = mEndDate;
		this.mInformation = mInformation;
	}



	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public float getmPrice() {
		return mPrice;
	}
	public void setmPrice(int mPrice) {
		this.mPrice = mPrice;
	}
	public String getmStartDate() {
		return mStartDate;
	}
	public void setmStartDate(String mStartDate) {
		this.mStartDate = mStartDate;
	}
	public String getmEndDate() {
		return mEndDate;
	}
	public void setmEndDate(String mEndDate) {
		this.mEndDate = mEndDate;
	}
	public String getmInformation() {
		return mInformation;
	}
	public void setmInformation(String mInformation) {
		this.mInformation = mInformation;
	}


	@Override
	public String toString() {
		return "Tour [mName=" + mName + ", mPrice=" 
				+ mPrice + ", mStartDate=" + mStartDate
				+ ", mEndDate=" + mEndDate
				+ ", mInformation=" + mInformation + "]";
	}
	
	
}
