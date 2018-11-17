
public class RiceFlourCommand implements BaseCommand {
	
	protected Kitchen kitchen;


	public RiceFlourCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setKithchen(Kitchen kit) {
		// TODO Auto-generated method stub
		kitchen = kit;

	}

	@Override
	public void executeCommand() {
		// TODO Auto-generated method stub

		kitchen.riceFlour();

	}

}
