package lab6;

import java.text.DecimalFormat;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Component order = new Composite( "         FIVE GUYS" ) ;
		
        CustomBurger customBurger = new CustomBurger("LBB", 5.59) ;
        Bacon b = new Bacon("BACON");
        Lettuce l = new Lettuce("LETTUCE");
        Tomato t = new Tomato("TOMATO");
        Onion o = new Onion("Onion");
        Jala j = new Jala("JALA Grilled");
        customBurger.addChild(b);
        customBurger.addChild(l);
        customBurger.addChild(t);
        customBurger.addChild(o);
        customBurger.addChild(j);

        LtlCaj lt = new LtlCaj("LTL CAJ", 2.79);
        order.addChild(customBurger);
        order.addChild(lt);
        
        ((PriceDecorator)order).wrapDecorator(customBurger);
        customBurger.wrapDecorator(lt);
        
        SortingStrategy strategy = new ReceiptSort();
        order.setStrategy(strategy);
        order.printDescription(strategy.showMoney());
        
        strategy = new PackingSort();
        order.setStrategy(new PackingSort());
        order.printDescription(strategy.showMoney());

	}

}
