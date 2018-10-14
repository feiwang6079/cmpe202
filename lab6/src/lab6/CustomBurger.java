package lab6;

import java.text.DecimalFormat;

public class CustomBurger extends Composite implements PriceDecorator {
	
	public CustomBurger(String d) {
		super(d);
	}
	
	public CustomBurger(String d, double price) {
		super(d, price);
		// TODO Auto-generated constructor stub
	}
    
    public void printDescription(boolean showMoney) {
        DecimalFormat fmt = new DecimalFormat("0.00");
        if(showMoney)
        {
        	System.out.println(description + "                           " + fmt.format(price));
        }
        else
        {
        	System.out.println(description);
        }
        for (Component obj  : components)
        {
            obj.printDescription(false);
        }
    }

}
