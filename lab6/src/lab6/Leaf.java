package lab6;

public class Leaf implements Component {

	private String description;
	private double price;
	
	public Leaf(String d, double p ) {
		// TODO Auto-generated constructor stub
		description = d;
		price = p;
	}

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		
		if(price == 0)
		{
			System.out.println(description );
		}
		else
		{
			System.out.println(description + "     " + String.valueOf(price));
		}
		
	}

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		return;

	}
	

}
