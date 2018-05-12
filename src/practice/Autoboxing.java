package practice;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// 定义double类型变量
				double a = 91.5;
		        
				// 手动装箱
				Double b =  new Double (a);      
		        
		        //自动装箱
				Double c =a; 

		        System.out.println("装箱后的结果为：" + b + "和" + c);
		        
		        // 定义一个Double包装类对象，值为87
				Double d = new Double(87.0);
		        
				// 手动拆箱
				double e = d.doubleValue()              ;
		        
				//自动拆箱
				double f = d               ;
		        
		         System.out.println("拆箱后的结果为：" + e + "和" + f);
		         /*
			 		 * 其中，基本类型转换为字符串有三种方法：
			 		 * 1. 使用包装类的 toString() 方法
			 		 * 2. 使用String类的 valueOf() 方法
			 		 * 3. 用一个空字符串加上基本类型，得到的就是基本类型数据对应的字符串
			 		 * 将字符串转换成基本类型有两种方法:
			 		 * 1. 调用包装类的 parseXxx 静态方法
			 		 * 2. 调用包装类的 valueOf() 方法转换为基本类型的包装类，会自动拆箱
			 		 * 
			 		 */
		     	double m = 78.5;
		     	//将基本类型转换为字符串
				String str1 =String.valueOf(m);                              ;
		        
				System.out.println("m 转换为String型后与整数20的求和结果为： "+(str1+20));
				
				String str = "180.20";
				// 将字符串转换为基本类型
				Double s =Double.valueOf(str)                        ;
				//int y=Integer.parseInt(str);
				System.out.println("str 转换为double型后与整数20的求和结果为： "+(s+20));
				Test20180512 test2 = new Test20180512();  
		        test2.run();
	}

}
