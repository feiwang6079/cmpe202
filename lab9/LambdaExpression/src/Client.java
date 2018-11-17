
public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Kitchen kitchen = new Kitchen();
	        Waiter waiter = new Waiter();
	        
	        waiter.setOrders(Kitchen::beefRice);
	        waiter.setOrders(Kitchen::beefBurger);
	        waiter.setOrders(Kitchen::riceFlour);
	        
	        waiter.placeOrder(kitchen);
	}
}