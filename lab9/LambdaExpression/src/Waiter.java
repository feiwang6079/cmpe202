import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Consumer;

public class Waiter {

    private Queue<Consumer<Kitchen>> orders ;

    public  Waiter() {
        orders = new ArrayDeque<>();
    }
    
    public void setOrders(Consumer<Kitchen> kitchenAction)
    {
    	orders.add(kitchenAction);
    }
    
    public void placeOrder(Kitchen kitchen){
        while (orders.peek() != null) {
            orders.peek().accept(kitchen);
            orders.remove();
        }
    }
	

}
