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
					
					System.out.println("�ڲ��ļ� "+files[i].getName()+" ɾ���ɹ�..."+files[i].delete());
				}
			}
		}
		System.out.println("�ⲿ�ļ� "+file.getName()+" ɾ���ɹ�..."+file.delete());
	}
}
