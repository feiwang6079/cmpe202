import java.util.ArrayDeque;
import java.util.Queue;

public class Waiter {

    private final Queue<BaseCommand> orders ;

    public  Waiter() {
        orders = new ArrayDeque<>();
    }
    
    public final void setOrders(BaseCommand baseCommand)
    {
    	orders.add(baseCommand);
    }
    
    public void placeOrder(){
        while (orders.peek() != null) {
            orders.peek().executeCommand();
            orders.remove();
        }
    }
	

}
