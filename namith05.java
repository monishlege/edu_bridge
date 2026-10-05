package asdfghjkl;

// this 

public class Demo {
	int c= 10;
	int d =20;
	void add(int a, int b) {
		System.out.println("sdfsd  " +(a+b));
		System.out.println("sdfsd  " +(c+d));
	}

	public static void main(String[] args) {
		Demo ff = new Demo();
		ff.add(2, 3);
	}
}
---------------------------

package asdfghjkl;

// this 

public class Demo {
	int a= 10;
	int b =20;
	void add(int a, int b) {
		System.out.println("sdfsd  " +(a+b));
//		System.out.println("sdfsd  " +(c+d));
	}

	public static void main(String[] args) {
		Demo ff = new Demo();
		ff.add(2, 3);
		
	}
}

_---------------------------------
package asdfghjkl;

// this 

public class Demo {
	int a = 10;
	int b = 20;

	void add(int a, int b) {
System.out.println(this.a+this.b);
System.out.println(a+b);

	}

	public static void main(String[] args) {
		Demo ff = new Demo();
		ff.add(2, 3);

	}
}

-----------------------------
package asdfghjkl;

// this 

public class Demo {
	int a  ;
	int b ;
	void add(int c , int d) {
		a=c;
		b=d;
	}
	void add1() {
		 System.out.println(a+b);
	}
	public static void main(String[] args) {
		Demo ff = new Demo();
		ff.add(2, 3);
		ff.add1();

	}
}


------------------------

package asdfghjkl;

// this 

public class Demo {
   int a ;
   int b ;
	void add(int a , int b) {
		this.a=a;
		this.b=b;

	}
	void add1() {
	System.out.println(a+b);
		
	}
	public static void main(String[] args) {
		Demo ff = new Demo();
		ff.add(2, 3);
ff.add1();

	}
}

------------------------------
