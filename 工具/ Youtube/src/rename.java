package YouTube;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class rename {
	public static void main(String[] args) {
		ArrayList<File> list = new ArrayList<File>();
		String path;
		System.out.println("输入文件目录");
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
		System.out.println("例句："+filename+"长度"+filename.length());
		System.out.println("输入第一段要删的文本");
		//鍦ㄨ繖杈撳叆绗竴娈靛瓧绗︿覆
		start = sc3.nextLine().length();
		System.out.println(start);
		System.out.println("输入第二段要删的文本");
		
		end = sc2.nextLine().length();
		System.out.println(end);
		System.out.println("文件新名字：");
		//纭鏄惁鏇存敼
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
