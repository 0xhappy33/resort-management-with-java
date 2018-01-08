package models;

public class Customer {
	private String mName;
	private int mAge;
	
	public Customer() {}
	
	public Customer(String mName, int mAge) {
		super();
		this.mName = mName;
		this.mAge = mAge;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getmAge() {
		return mAge;
	}
	public void setmAge(int mAge) {
		this.mAge = mAge;
	}

	@Override
	public String toString() {
		return "Customer << name : " + mName + ", age : " + mAge + " >>";
	}
	
	
	
}
