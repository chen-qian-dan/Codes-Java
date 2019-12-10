package tutorial1;

import tutorial1.OuterClass1.InnerClass;

public class InnerClassDemo1 {

	public static void main(String[] args) {
		// create outer Class object to let inner Class exist; 
		OuterClass1 out = new OuterClass1(); 
				
		OuterClass1.InnerClass in = out.new InnerClass(); 
		in.display();

	}

}
