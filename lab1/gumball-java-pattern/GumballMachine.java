
enum MachineModel {FIRSTMODEL, SECONDMODEL, THIRDMODEL}

public class GumballMachine {
 
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	
	State notEnoughQuarterState;  // It inserts coins, but not enough.
	MachineModel model;   //judge which machine
	int coinCount = 0;    //how money coin has inserted
 
	public GumballMachine(int numberGumballs, MachineModel model) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		notEnoughQuarterState = new NotEnoughQuaterState(this);

		this.count = numberGumballs;
 		if (numberGumballs > 0) {
			state = noQuarterState;
		} else {
			state = soldOutState;
		}
 		
 		this.model = model;
	}
 
	public void insertQuarter(int coin) {
	//judge which machine should be chosen	
		if(model == MachineModel.FIRSTMODEL) {
			if(coin == 25)
				state.insertQuarter();
		} else if(model == MachineModel.SECONDMODEL) {
			if(coin == 25) {
				coinCount += coin;
				if(coinCount == 50)
					state.insertQuarter();
				else
					state = notEnoughQuarterState;
			}
		}else {
			coinCount += coin;
			if(coinCount >= 50)
				state.insertQuarter();
			else
				state = notEnoughQuarterState;
		}		
	}
 
	public void ejectQuarter() {
		state.ejectQuarter();
		
		coinCount = 0;
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
		
		coinCount = 0;    //reset coin
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count = count;
		state = noQuarterState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
	
	public MachineModel getModel() {
		return this.model;
	}
}
