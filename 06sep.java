package mentallll;

public class sep06 {
	
		void marry()
		{
			System.out.println("slelcted by family");
		}
		void propert()
		{
			System.out.println("propety of family");
		}
	}

	class Demo extends sep06 {
		void marry()
		{
			System.out.println("campus selected");
		}
		public static void main(String[] args) {
			Demo bb = new Demo();
			bb.marry();
			bb.propert();
		}

	}
--------------------------------------------------------------------------
package mentallll;

//
class Parent {
	private int a;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
}

class Demo extends Parent {

	public static void main(String[] args) {
		Demo bb = new Demo();
		bb.setA(7);
		int ss = bb.getA();
		System.out.println(ss);
	}

}
---------------------------------------------------------------------------
package mentallll;

class sep061 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class sep06 extends sep061 {

    public static void main(String[] args) {
        sep06 bb = new sep06();
        bb.setName("Monish");
        String ss = bb.getName();
        System.out.println(ss);
    }

}
-------------------------------------------------------------------------------------------------------
