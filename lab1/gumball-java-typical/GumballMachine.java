
enum MachineModel{ ONEMODEL, TWOMODEL , THREEMODEL }


public class GumballMachine
{

    private int num_gumballs;
    private boolean has_quarter;
    
    private MachineModel model; //judge which machine 
    private int coinCount;     //how much money has been inserted

    public GumballMachine( int size, MachineModel machineModel)
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
        
        this.model = machineModel;
        this.coinCount = 0;
       
    }

    public void insertQuarter(int coin)
    {
        if(model == MachineModel.ONEMODEL)
        {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
        }
        else if(model == MachineModel.TWOMODEL)
        {
            if(coin == 25){
               coinCount += coin;
               if(coinCount == 50)
                  this.has_quarter = true;
               else
                  this.has_quarter = false ;
            }
        }else{
            coinCount += coin;
            if(coinCount >= 50)
                this.has_quarter = true;
            else
                this.has_quarter = false ;
        }
    }
    
    public void turnCrank()
    {
        if ( this.has_quarter )
        {
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.has_quarter = false ;
                this.coinCount = 0;
                System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else 
        {
            if(model == MachineModel.ONEMODEL || model == MachineModel.TWOMODEL)
               System.out.println( "Please insert a quarter" ) ;
            else
               System.out.println("Please insert a coin");
        }        
    }
}
