package tutorial1;

public class EnumDemo {

	public static void main(String[] args) {
		/*
		Level lvl = Level.LOW;
		
		if (lvl == Level.LOW)
		{
			System.out.println(lvl); 
		}
		else if (lvl == Level.MEDIUM)
		{
			System.out.println(lvl); 
		}
		else
		{
			System.out.println(lvl); 
		}
		
		// print enum values; 
		Level[] arr = Level.values(); 
		for (Level e : arr)
		{
			System.out.println(e); 
		}
		*/
		
		Level lvl = Level.LOW; 
		System.out.println(Level.valueOf("LOW"));
		
		lvl.setLvl(5);
		System.out.println(lvl.getLvl());

	}

}
