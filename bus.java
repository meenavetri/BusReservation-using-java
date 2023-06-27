package busReservation;

public class bus {
	private int busNo;
	private boolean ac;
	private int capacity;//get and set methods
	
	bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	
	 public int  getCapacity(){//accessor method
		retpurn capacity;
	}
     public void setCapacity(int cap) {//mutator
    	 capacity = cap;
  
     }
     public int getBusno() {
    	 return busNo;
     }
     public boolean isAc() {
    	 return ac;
     }
     public void setAc(boolean val) {
    	 ac= val;
     }
      void displayBusInfo(){
    	  System.out.println("Bus No: " + busNo +" Ac:" + ac  +  " Total capacity: " + capacity);
      }
}
