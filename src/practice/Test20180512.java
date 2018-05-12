package practice;

public class Test20180512 {
	/*String str="hello world";
	public static void ChangeStr(String str) {
		 String  str="welcome njws!";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test20180512.ChangeStr(str);
		ChangeStr(str);
		//System.out.println(str);
	}
*/
	 int num;  
	    String name;  
	//  void A(int p_num,String p_name){ //TTTT///参数名和成员变量名不同，可以这样做；  
//	      num=p_num;  
//	      name=p_name;  
	//  }  
	//  void A(int p_num,String p_name){ //TTTT///参数名和成员变量名不同，可以这样做；  
//	      this.num=p_num;  
//	      this.name=p_name;  
	//  }  
	    void A(int num,String name){  
//	      num=num;///The assignment to variable num has no effect  
//	      name=name;///fff  //参数名和成员变量名相同，不可以这样做；  
	        this.num=num;  ////TTT  this显式的指明当前对象  
	        this.name=name;////必须要用this才对  
	    }  
	    public void run() {  
	        System.out.println(this);  
	    }  
	     public String toString() {  
	     return "hello";  
	     }  
	}  /*
	public class Test {  
	    public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	    	Test20180512 a = new Test20180512();  
	        a.run();////this调用A类中的toString方法  
	    }  
	}  
	//输出 hello  */

