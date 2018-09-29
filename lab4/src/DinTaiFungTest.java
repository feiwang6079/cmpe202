
public class DinTaiFungTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer p1 = new Customer("dong", 333333333, 6);

		Customer p2 = new Customer("fei", 222222222, 4);
				
		Customer p3 = new Customer("wang", 111111111, 2);
		
		p1.goToDinTaiFung();
		p2.goToDinTaiFung();
		p3.goToDinTaiFung();

		DinTaiFungServer server = DinTaiFungServer.getInstance();

		server.seatAvailable(5);

	}

}
