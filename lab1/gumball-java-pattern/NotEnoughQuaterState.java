
public class NotEnoughQuaterState implements State {
	
     GumballMachine gumballMachine;

	
	 public NotEnoughQuaterState(GumballMachine gumballMachine) {
	        this.gumballMachine = gumballMachine;
	    }
	 
		public void insertQuarter() {
			if(gumballMachine.getModel() == MachineModel.SECONDMODEL)
				System.out.println("You inserted enough quarters");
			else
				System.out.println("You inserted enough coins");

			gumballMachine.setState(gumballMachine.getHasQuarterState());
		}
	 
		public void ejectQuarter() {
			
			if(gumballMachine.getModel() == MachineModel.SECONDMODEL)
				System.out.println("quarters returned");
			else
				System.out.println("coins returned");
			
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
	 
		public void turnCrank() {
			
			if(gumballMachine.getModel() == MachineModel.SECONDMODEL)
			     System.out.println("You turned, but you don't have enough quarters");
			else
			     System.out.println("You turned, but you don't have enough coins");

		}
	 
		public void dispense() {
			
			if(gumballMachine.getModel() == MachineModel.SECONDMODEL)
				System.out.println("You need to pay enough quarters");
			else
				System.out.println("You need to pay enough coins");
		} 
	 
		public String toString() {
			
			if(gumballMachine.getModel() == MachineModel.SECONDMODEL)
				return "waiting for enough quarters";
			else
			    return "waiting for enough coins";
		}

}
