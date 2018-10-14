package lab6;

import java.util.ArrayList;

public class PackingSort implements SortingStrategy {

	public PackingSort() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean showMoney()
	{
		return false;
	}

	@Override
	public ArrayList<Component> sort(ArrayList<Component> a) {
		// TODO Auto-generated method stub
		
		ArrayList<Component> array = new ArrayList<Component>();
        for (Component obj  : a)
        {
        	String name1 = (obj.getClass().getName()).split("\\.")[1] ;
        	
            if(name1.equals("CustomBurger"))
            {
            	Component c = null;
            	for(int i = 0 ; i < obj.getChildCount(); i++) {
            		Component childObj = obj.getChild(i);
                	String name2 = (childObj.getClass().getName()).split("\\.")[1] ;
            		if(name2.equals("Bacon"))
            		{
            			c = childObj;
            			obj.removeChild(childObj);
            		}
            	}
            	if(c != null)
            	{
            		obj.addChild(c);
            	}
            	array.add(obj);
            }
            else
            {
            	array.add(obj);
            }
        }
		
		return array;
	}

}
