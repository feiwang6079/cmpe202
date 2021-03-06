package lab6;

public class Leaf implements Component, PriceDecorator{

	protected String description ;
    protected Double price ;
    
    PriceDecorator wrapped ;
	
    public Leaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
	public Leaf(String d) {
		// TODO Auto-generated constructor stub
        description = d ;
        price = 0.0 ;
	}
	
	   public void wrapDecorator( PriceDecorator w ) 
	   {
	       this.wrapped = w ;
	   }

	@Override
	public void printDescription(boolean showMoney) {
		// TODO Auto-generated method stub
		System.out.println( " " + description) ;

	}
	
    public String getDescription() {
    	return description;
    }

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeChild(Component c) {
		// TODO Auto-generated method stub

	}

	@Override
	public Component getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getChildCount() {
		return 1;
	}
	
	public void setStrategy(SortingStrategy s) {
		return;
	}
 
	
	   public double getPrice() {
	        if (wrapped == null )
	        {
	            return price ;
	        }
	        else 
	        {
	            return price + wrapped.getPrice() ;
	        }
	    }

}
