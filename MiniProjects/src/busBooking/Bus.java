package busBooking;

public class Bus {
     private int busNo;
     private boolean ac;
     private int capasity;
     
     public Bus(int no,boolean ac,int cap) {
    	 busNo = no;
    	 this.ac= ac;
    	 capasity = cap;	 
     }

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapasity() {
		return capasity;
	}

	public void setCapasity(int capasity) {
		this.capasity = capasity;
	}
     
     public void display() {
    	 System.out.println("Bus No : "+busNo+"  AC : "+ac+"  Capasity : "+capasity);
     }
	
}
