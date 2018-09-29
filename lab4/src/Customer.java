
public class Customer {
	
	private String name;
	private long cellphone;
	private int numberParty;
	
	private int seatSize;

	public Customer(String name, int phone, int number) {
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.cellphone = phone;
		this.numberParty = number;
	}

	public String getName() {
		return name;
	}
	
	public long getCellphone() {
		return cellphone;
	}
	
	public int getNumberParty() {
		return numberParty;
	}
	
	public void setSeatSize(int seatSize) {
		this.seatSize = seatSize;
	}
	
	public int getSeatSize() {
		return seatSize;
	}
	
	public void goToDinTaiFung() {
		DinTaiFungServer server = DinTaiFungServer.getInstance();
		server.addCustomer(this);
	}
	
	
	public void getMessage(String message) {
		System.out.println(this.getName()+" get Message :"+message);
		if(message.equals("Table is ready")) {
			final long l = System.currentTimeMillis();
			final int i = (int)( l % 2 ); 
	//Simulate the user's behavior by random number, 0 means the user confirm , 1 means the user cancel
			
			MessageServer server = MessageServer.getInstance();
			if(i == 0) {
				server.getMessage(this, "leave");
			}else {
				server.getMessage(this, "confirm");
			}	
		}
	}
	
}
