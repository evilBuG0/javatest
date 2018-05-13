package practice;

public class Teast20180513 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num=new int[10];
		for(int i=0;i<num.length;i++) {
			int x=(int)(Math.random()*10);
			num[i]=x;
		}
		for(int a:num) {
			System.out.println(a);
		}
	}

}
