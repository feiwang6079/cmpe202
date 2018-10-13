package lab6;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Composite implements Component, PriceDecorator {
	
    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;

    private PriceDecorator decorator = null ;
    protected double price;
    
	public Composite (String d) {
		// TODO Auto-generated constructor stub
        description = d ;
        price = 0.0;
	}
	
	public Composite (String d, double p) {
		// TODO Auto-generated constructor stub
        description = d ;
        price = p;
	}

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }

	}

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		
        components.add( c ) ;

	}

	@Override
	public void removeChild(Component c) {
		// TODO Auto-generated method stub
		
        components.remove(c) ;

	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
	    return components.get( i ) ;	
	}
	
	public void wrapDecorator( PriceDecorator w ) {
		decorator = w;
	}

	public double getPrice() {
		if (decorator == null )
			{
				return price ;
			}
	        else 
	        {	            
	            return price + decorator.getPrice() ;
	        }
	    }
}
