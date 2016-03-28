package com.matlab.image;

public class DealTask implements Runnable {
	private static int rgb[][][];
	private int rnum,gnum,bnum;
	public DealTask(int r,int g, int b) {
		this.rnum = r;
		this.gnum = g;
		this.bnum = b;
	}
	@Override
	public void run() {
		FileOpera op = new FileOpera();
		DealImage di = new DealImage(rnum,gnum,bnum);
		rgb = op.RgbRead();
		rgb = di.add(rgb);
		try {
			op.RgbSet(rgb);
		} catch (Exception e) {
			System.err.println("Êä³öÍ¼ÏñÊ§°Ü");
			e.printStackTrace();
		}

	}

}
