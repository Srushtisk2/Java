package com.xworkz.phone;

import com.xworkz.phone.dto.Vivo;
import com.xworkz.phone.dto.Phone;

public class TestPhone {
	public static void main(String []args) {
		
		    Vivo vivo = new Vivo();
			System.out.println(vivo.company("vivo"));
			System.out.println(vivo.profit((long)(50000)));
			System.out.println(vivo.founder("xyz"));
			System.out.println(vivo.models(5));
			System.out.println(vivo.quality(true));
			
			Phone phone = new Phone();
			
			System.out.println(phone.color("blue"));
			System.out.println(phone.height(87.50f));
			System.out.println(phone.price((long)20000));
			System.out.println(phone.width((byte)(50)));
			System.out.println(phone.name("mejestic"));
			
			
			
			
		}
}
