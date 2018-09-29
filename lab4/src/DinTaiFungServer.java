import java.util.ArrayList; 

public class DinTaiFungServer {
	
	private static DinTaiFungServer instance;
	private ArrayList<Customer> customers  = new ArrayList<Customer>();
	private MessageServer messageServer = MessageServer.getInstance();

	private DinTaiFungServer() {
		// TODO Auto-generated constructor stub
	}
	
	public static DinTaiFungServer getInstance(){
		if(instance == null) {
			instance = new DinTaiFungServer();
		}
		return instance;
	}
	
	public void addCustomer(Customer p) {
		customers.add(p);
		messageServer.sendMessage(p, "You'are in line");
	}
	
	public void seatAvailable(int seatSize) {
		
		Inspector inspector = new Inspector();
		
		for( int i = 0; i <customers.size(); i++) {
			Customer p = customers.get(i);
			if(inspector.customQualified(p, seatSize)) {
				break;
			}else{
				System.out.print(p.getName()+"'s number of party is "+p.getNumberParty()+" > "+ "seat size " + seatSize);
				System.out.println(" So, you have to continue wait");
			}
			
		}
	}
	
	public void getCustomerReply(Customer p, String message) {
		
		int seatSize = p.getSeatSize();
		customers.remove(p);
		if(message.equals("confirm")) {
			System.out.println(p.getName()+" confirm the wait list");
		}else {
			System.out.println(p.getName()+" leave the wait list");
			this.seatAvailable(seatSize);
		}
	}
}
