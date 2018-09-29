
public class Inspector {
	
	MessageServer messageServer = MessageServer.getInstance();

	public Inspector() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean customQualified(Customer p, int seatSize) {
		if(p.getNumberParty() <= seatSize) {
	    	p.setSeatSize(seatSize);
			messageServer.sendMessage(p, "Table is ready");
			return true;
		}else {
			return false;
		}
		
	}

}
