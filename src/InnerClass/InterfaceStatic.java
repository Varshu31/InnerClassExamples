package InnerClass;

public interface InterfaceStatic {
	   void show();
	   
	public class StaticNestedClass {
	    
		static String data="Varsha Sid";
		public void display()
		{
			System.out.println("Inside Outer");
			
				
		}
		
		static class StaticInnerClass
		{
			
			public void show(){
				System.out.println("INside Inner method " +data); 
				 
			 }
			
		}
		
		public static void main(String[] args) {
			
			StaticNestedClass.StaticInnerClass in=new StaticNestedClass.StaticInnerClass();
			in.show();
			StaticNestedClass o=new StaticNestedClass();
			o.display();
			
		   
		}
		
	}

}
