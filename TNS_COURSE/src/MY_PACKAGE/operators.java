package MY_PACKAGE;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int a = 10;
	  int b = 15;
	  
	System.out.println("add:" +(a+b));
	System.out.println("sub:" +(a-b));
	System.out.println("mul:" +(a*b));
	System.out.println("div:" +(a/b));
	System.out.println("mod:" +(a%b));
	
	System.out.println("\nRelational Operators");

    System.out.println(a > b);

    System.out.println(a < b);

    System.out.println(a >= b);

    System.out.println(a <= b);

    System.out.println(a == b);

    System.out.println(a != b);

	
	boolean x = true;
	boolean y = false;
	System.out.println("\nLogical Operators");

	System.out.println(x&&y);
	System.out.println(x||y);
	
	System.out.println(!x);
	
	System.out.println("\nAssignment Operators");

	int d = 20;
	
	d+=5;
	  System.out.println("d+= 5 : " + d);
		d-=5; 
	  System.out.println("d-= 5 : " + d);
	  
	  System.out.println("\nUnary Operators");

      int c = 10;

      System.out.println("Post Increment: " + (c++));
      System.out.println("After Increment: " + c);
      System.out.println("Pre Increment: " + (++c));
      System.out.println("Post Decrement: " + (c--));

      System.out.println("After Decrement: " + c);

      System.out.println("Pre Decrement: " + (--c));
      
      System.out.println("\nBitwise Operators");

      System.out.println("Bitwise AND: " + (a & b));

      System.out.println("Bitwise OR: " + (a | b));

      System.out.println("Bitwise XOR: " + (a ^ b));

      System.out.println("Bitwise Complement of a: " + (~a));
      System.out.println("\nShift Operators");

      System.out.println("Left Shift: " + (a << 2));

      System.out.println("Right Shift: " + (a >> 2));
      System.out.println("\nTernary Operator");

      String result = (a > b)
              ? "a is Greater"
              : "b is Greater";

      System.out.println(result);

     
	
	}

}
