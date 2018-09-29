
public class MessageServer {
	
	private static MessageServer instance;

	private MessageServer() {
		// TODO Auto-generated constructor stub
	}
	
	public static MessageServer getInstance(){
		if(instance == null) {
			instance = new MessageServer();
		}
		return instance;
	}
	
	public void sendMessage(Customer p, String message) {
		p.getMessage(message);
	}
	
	public void getMessage(Customer p, String message) {
		DinTaiFungServer server = DinTaiFungServer.getInstance();
		server.getCustomerReply(p, message);
	}
}
