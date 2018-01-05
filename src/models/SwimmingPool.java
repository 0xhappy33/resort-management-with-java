package models;


public class SwimmingPool {
	private String openTime;
	
	public SwimmingPool() {}
	
	public SwimmingPool(String openTime) {
		this.openTime = openTime;
	}
	
	public String getOpenTime() {
		return this.openTime;
	}
	
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	@Override
	public String toString() {
		return "SwimmingPool [openTime=" + openTime + "]";
	}
	
}
