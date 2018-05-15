package practice;

 class StaticSuper {
	static {
		System.out.println("super static block");
	}
	StaticSuper(){
		System.out.println("super constructor");
	}
 }
	public class StaticTestsa extends StaticSuper{
		static int rand;
		static {
			rand=(int)(Math.random()*6);
			System.out.println("static block: "+rand);
		}
		StaticTestsa(){
			System.out.println("constructor");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		StaticTestsa a=new StaticTestsa();

	}
	
}
