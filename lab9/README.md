# lab9

#Command Pattern

Principle
use method references for passing command objects to the invoker without having to create the Command instance

Merit
The original advantages are still preserved
The code is a little bit more compact and less verbose


//before
		 	    
		Kitchen kitchen = new Kitchen();
	        Waiter waiter = new Waiter();
	        
	        BaseCommand beefRiceCommand = new BeefRiceCommand();
	        beefRiceCommand.setKithchen(kitchen);
	        
	        BaseCommand beerBurgerCommand = new BeefBurgerCommand();
	        beerBurgerCommand.setKithchen(kitchen);

	        BaseCommand riceFlourCommand = new RiceFlourCommand();
	        riceFlourCommand.setKithchen(kitchen);

	        waiter.setOrders(beefRiceCommand);
	        waiter.setOrders(beerBurgerCommand);
	        waiter.setOrders(riceFlourCommand);
	        
	        waiter.placeOrder();

//after 
		      
		Kitchen kitchen = new Kitchen();
	        Waiter waiter = new Waiter();
	        
	        waiter.setOrders(Kitchen::beefRice);
	        waiter.setOrders(Kitchen::beefBurger);
	        waiter.setOrders(Kitchen::riceFlour);
	        
	        waiter.placeOrder(kitchen);

