package com.heima.test;

import java.io.File;

public class FileDelTest {

	public static void main(String[] args) {
		new FileDelTest().fileDelete(new File("E:\\111"));
	}
	
	public void fileDelete(File file) {
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for(int i=0; i<files.length; i++) {
				if(files[i].isDirectory()) {
					fileDelete(files[i]);
				}else {
					
					System.out.println("内部文件 "+files[i].getName()+" 删除成功..."+files[i].delete());
				}
			}
		}
		System.out.println("外部文件 "+file.getName()+" 删除成功..."+file.delete());
	}
}
