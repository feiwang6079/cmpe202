package lab6;

import java.util.ArrayList;

public class Composite implements Component {
	
	private ArrayList<Component> components = new ArrayList<Component>();
	private String description;
	private double price;

	public Composite(String c, double p) {
		// TODO Auto-generated constructor stub
		description = c;
		price = p;
	}

	@Override
	public void printDescription() {
		// TODO Auto-generated method stub
		
		if(price == 0)
		{
			System.out.println(description);
		}
		else
		{
			System.out.println(description + "     " + String.valueOf(price));
		}
		for(Component obj: components) {
			System.out.print(" ");
			obj.printDescription();
		}

	}

	@Override
	public void addChild(Component c) {
		// TODO Auto-generated method stub
		components.add(c);
	}

}
