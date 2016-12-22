package com.matlab.image;

import java.util.concurrent.Callable;

public class DealTask implements Callable<Boolean> {
	private static int rgb[][][];
	private int rnum,gnum,bnum;
	public DealTask(int r,int g, int b) {
		this.rnum = r;
		this.gnum = g;
		this.bnum = b;
	}
	
	@Override
	public Boolean call() {
		FileOpera op = FileOpera.getInstance();
		rgb = op.RgbRead();
		rgb = ImageUtil.add(rgb,rnum,gnum,bnum);
		try {
			op.RgbSet(rgb);
			return true;
		} catch (Exception e) {
			System.err.println("Êä³öÍ¼ÏñÊ§°Ü");
			e.printStackTrace();
		}
		return false;
	}

}
