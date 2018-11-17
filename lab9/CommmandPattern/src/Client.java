
public class Client {

	public Client() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 Kitchen kitchen = new Kitchen();
	        Waiter waiter = new Waiter();
	        
	        BaseCommand beefRiceCommand = new BeefRiceCommand();
	        beefRiceCommand.setKithchen(kitchen);
	        
	        BaseCommand beerBurgerCommand = new BeefBurgerCommand();
	        beerBurgerCommand.setKithchen(kitchen);

	        BaseCommand riceFlourCommand = new RiceFlourCommand();
	        riceFlourCommand.setKithchen(kitchen);

	        waiter.setOrders(beefRiceCommand);
	        waiter.setOrders(beerBurgerCommand);
	        waiter.setOrders(riceFlourCommand);
	        
	        waiter.placeOrder();
	}
}
