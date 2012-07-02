package com.guojing;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TimeTmapTest {
	@SuppressWarnings("deprecation")
	@Test
	public void test(){
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String str ="2010-03-05";
		Date parse = null;
		String format = sdf.format(parse);
		try {
			parse = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(parse);
		System.out.println(format);
		
	}
}
