package InnerClass;
class NestedClass
{
 public void display()
 {
 // Inner in=new Inner();
 // in.show();
	 System.out.println("display");
 }

 class Inner
 {
  public void show()
 
  {
	  display();
   System.out.println("Inside inner");
  } 
 }
}

class MemberNestedClass
{
 public static void main(String[] args)
 {
	 NestedClass ot=new NestedClass();
	 NestedClass.Inner in= ot.new Inner();
	 in.show();
  
 }
}
