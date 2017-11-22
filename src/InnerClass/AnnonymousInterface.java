package InnerClass;
 
	interface Animal
	{
	 void type();
	}
	 public  class AnnonymousInterface 
	{
	 public static void main(String args[])
	 {
	  Animal an = new Animal(){         //Annonymous class created
	  public void type()
	  {
	   System.out.println("Annonymous animal"); 
	  }
	 };
	  an.type();      
	 }
	}

