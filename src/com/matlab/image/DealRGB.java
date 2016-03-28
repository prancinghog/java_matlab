package com.matlab.image;

import java.util.Arrays;

public class DealRGB {
	int[] rgb_n = new int[3];
	public DealRGB() {

	}
	public int[] MathToRgb(int math){
		rgb_n[0] = (math & 0xff0000) >> 16;
		rgb_n[1] = (math & 0xff00) >> 8;
		rgb_n[2] = (math & 0xff);

		return  rgb_n;
	}
	public int RgbToMath(int[] rgb) throws Exception{
		String m1 = Integer.toHexString(rgb[0]);
		String m2 = Integer.toHexString(rgb[1]);
		String m3 = Integer.toHexString(rgb[2]);
		if (m1.length()<2) {
			m1 = "0"+m1;
		}
		if (m2.length()<2) {
			m2 = "0"+m2;
		}
		if (m3.length()<2) {
			m3 = "0"+m3;
		}
		String max;	
		max=m1+m2+m3; 
		//		System.out.println(max);
		int newNumber = Integer.valueOf(max,16);
		//		System.out.println(newNumber);
		//		m = m.toUpperCase();
		//		System.out.println(m);

		return newNumber;  



	}
}
