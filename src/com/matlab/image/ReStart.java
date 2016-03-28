package com.matlab.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ReStart{
	private FileOpera op = new FileOpera();
	private FilePath filepath = new FilePath();
	int width = op.getWidth();
	int height = op.getHeight();
	
	public void myRun() {
		int[][] ave = op.rgbRead2gray();
		//灰度变化的操作
		BufferedImage grayImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);//重点，技巧在这个参数BufferedImage.TYPE_BYTE_GRAY  
		for(int i= 0 ; i < width ; i++){  
			for(int j = 0 ; j < height; j++){    
				grayImage.setRGB(i, j, ave[i][j]);     
			}  
		}  
		String str = filepath.getUripath_new();
		try {
			ImageIO.write(grayImage, "png", new File(str));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
