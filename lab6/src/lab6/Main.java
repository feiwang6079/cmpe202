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
        Onion o = new Onion("Onion");
        customBurger.addChild(b);
        customBurger.addChild(l);
        customBurger.addChild(o);

        LtlCaj lt = new LtlCaj("LTL CAJ", 2.79);
        order.addChild(customBurger);
        order.addChild(lt);
        order.printDescription();
        
        ((PriceDecorator)order).wrapDecorator(customBurger);
        customBurger.wrapDecorator(lt);
        double price = ((PriceDecorator)order).getPrice();
        DecimalFormat fmt = new DecimalFormat("0.00");

        System.out.println("\nall money                     " + fmt.format(price));
	}

}
