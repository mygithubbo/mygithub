package YouTube;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class rename {
	public static void main(String[] args) {
		ArrayList<File> list = new ArrayList<File>();
		String path;
		System.out.println("�����ļ�Ŀ¼");
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);

		path = sc.next();
		File f = new File(path);
		File[] flist = new File[100];
		flist = f.listFiles();

		for(File file:flist){
			if(file!=null){
				list.add(file);
				System.out.println(file.getName());
			}
				
		}
		
		String filename;
		String filepath;
		String tmpname;
		int start;
		int end;
		filename = list.get(0).getName();
		System.out.println("���䣺"+filename+"����"+filename.length());
		System.out.println("�����һ��Ҫɾ���ı�");
		//在这输入第一段字符串
		start = sc3.nextLine().length();
		System.out.println(start);
		System.out.println("����ڶ���Ҫɾ���ı�");
		
		end = sc2.nextLine().length();
		System.out.println(end);
		System.out.println("�ļ������֣�");
		//确认是否更改
		for(File file:list){
			filename = file.getName();
			System.out.println(filename.substring(start, filename.length()-4-end)+filename.substring(filename.length()-4, filename.length()));
			filename = filename.substring(start, filename.length()-4-end)+filename.substring(filename.length()-4, filename.length());
		}
		for(File file:list){
			filename = file.getName();
			filename = filename.substring(start, filename.length()-4-end)+filename.substring(filename.length()-4, filename.length());
			File newfile = new File(file.getParent()+"\\"+filename);
			file.renameTo(newfile);
		}
	}

}
