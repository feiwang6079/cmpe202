

public class Main {

	public static void main(String[] args) {
	    
	   // Machine One
		GumballMachine gumballMachineOne = new GumballMachine(5, MachineModel.ONEMODEL);

		System.out.println(gumballMachineOne);

		gumballMachineOne.insertQuarter( 25 );
		gumballMachineOne.turnCrank();

		System.out.println(gumballMachineOne);
		
        //Machine two
        
	    GumballMachine gumballMachineTwo = new GumballMachine(5, MachineModel.TWOMODEL);

		System.out.println(gumballMachineTwo);

		gumballMachineTwo.insertQuarter( 25 );
		gumballMachineTwo.turnCrank();

		System.out.println(gumballMachineTwo);

		gumballMachineTwo.insertQuarter( 25 );
		gumballMachineTwo.turnCrank();

		System.out.println(gumballMachineTwo);
		
        //Machine three
        
        GumballMachine gumballMachineThree = new GumballMachine(5, MachineModel.THREEMODEL);

		System.out.println(gumballMachineThree);

		gumballMachineThree.insertQuarter( 25 );
		gumballMachineThree.turnCrank();

		System.out.println(gumballMachineThree);

		gumballMachineThree.insertQuarter( 10 );
		gumballMachineThree.turnCrank();
		
		gumballMachineThree.insertQuarter( 25 );
		gumballMachineThree.turnCrank();

		System.out.println(gumballMachineThree);
                
	}
}
