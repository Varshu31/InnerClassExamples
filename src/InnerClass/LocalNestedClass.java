package InnerClass;


class OuterNestedClass
{
 public void display()
 {
	 
	 class Inner
	 {
	  public void show()
	  {
	   System.out.println("Inside inner");
	  } 
	 }
	 
  Inner in=new Inner();
  in.show();
 }
 }

class LocalNestedClass
{
 public static void main(String[] args)
 {
	 OuterNestedClass ot=new OuterNestedClass();
  ot.display();
 }
}
