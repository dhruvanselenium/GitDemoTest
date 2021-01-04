package javatest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf=new SimpleDateFormat("d/M/YYYY");
		SimpleDateFormat sd=new SimpleDateFormat("d/M/YYYY h:mm:ss");
		Date d=new Date();
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
	}

}
