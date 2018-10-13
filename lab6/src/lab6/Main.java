package lab6;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Component order = new Composite("FIVE GUYS", 0);
		
		Component burger = new Composite("LBB", 5.59);
		burger.addChild(new Leaf("{{{{BACON}}}}", 0) );
		burger.addChild(new Leaf("LETTUCE", 0) );
		burger.addChild(new Leaf("TOMATO", 0) );
		burger.addChild(new Leaf("->|G ONION", 0) );
		burger.addChild(new Leaf("->|JALA Grilled", 0) );
		
		order.addChild(burger);
		order.addChild(new Leaf("LTL CAJ", 2.79));
		
		order.printDescription();


	}

}
