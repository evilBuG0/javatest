package practice;
import java.util.*;
import java.text.*;
public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date time =new Date();
		String str2="2018-05-12 22:11:58";
		System.out.println(time.getTime()/1000);
		System.out.println(time.toString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String str =sdf.format(time);
		System.out.println(str);
		try {
			Date time2=sdf.parse(str2);
			System.out.println(time2.getTime()/1000);
		}catch(ParseException e){
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("-----------");
		/*Calendar cal=Calendar.getInstance();
		System.out.println(cal.toString());*/
		Date date=new Date();
		GregorianCalendar gcalender=new GregorianCalendar();
		gcalender.setTime(date);
		int year=gcalender.get(Calendar.YEAR);
		int month=gcalender.get(Calendar.MONTH);
		int day=gcalender.get(Calendar.DAY_OF_MONTH);
		System.out.println("year:"+year+" month: "+month+" day: "+day);
	}

}
