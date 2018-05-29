package practice;

public class TryCatchTeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTeat tct=new TryCatchTeat();
		int result=tct.test();
		System.out.println("test方法执行完毕，返回值为："+result);
		
	}
	/*
	 * divider(除数)
	 * result（结果）
	 * try-catch捕获whlie循环
	 * 每次循环while减一，result=result+100/divider
	 * 如果捕获异常，打印输出：捕获异常了，结果输出-1
	 * .否则返回result
	 * */
	public int test() {
		int divider=10;
		int result=100;
		try {
			while(divider>-1) {
				result/=divider;
				result+=100;
				divider--;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了");
			
			return -1;
		}finally {
			System.out.println("这是finally块");
		}
		
	
	}
}
