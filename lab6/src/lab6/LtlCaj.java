package lab6;

import java.text.DecimalFormat;

public class LtlCaj extends Leaf {

	public LtlCaj(String d, Double p) {
		super(d, p);
		// TODO Auto-generated constructor stub
	}

	public LtlCaj(String d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void printDescription() {
	

		DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.println(description + "                       " + fmt.format(price) ) ;
		
	}

}
