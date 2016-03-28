package com.matlab.image;

public class DealImage {
	private int rnum,gnum,bnum;
	private FileOpera op = new FileOpera();
	public DealImage(int r,int g, int b) {
		this.rnum = r;
		this.gnum = g;
		this.bnum = b;
	}
	public int[][][] add(int[][][] rgb) {  //色彩增强
		int width = op.getWidth();
		int height = op.getHeight();
		
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				rgb[i][j][0] = rgb[i][j][0]+rnum;  //红通道
				rgb[i][j][1] = rgb[i][j][1]+gnum;	//绿通道
				rgb[i][j][2] = rgb[i][j][2]+bnum;	//蓝通道
				if (rgb[i][j][0]>255) {				//执行了截断算法
					rgb[i][j][0] = 255;
				}else if(rgb[i][j][0] < 0){
					rgb[i][j][0] = 0;
				}
				if (rgb[i][j][1]>255) {
					rgb[i][j][1] = 255;
				}else if(rgb[i][j][1] < 0){
					rgb[i][j][1] = 0;
				}
				if (rgb[i][j][2]>255) {
					rgb[i][j][2] = 255;
				}else if(rgb[i][j][2] < 0){
					rgb[i][j][2] = 0;
				}
			}
		}

		return rgb;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public void setGnum(int gnum) {
		this.gnum = gnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	
	
}
