package YouTube;

import java.util.Scanner;

public class createdir {
	public static void main(String[] args) {
		while(true) {
		String srcadr;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("����Դ��ַ��");
		srcadr = sc.next();
		System.out.println("����Ҫ���ɶ��ٸ���");
		j = sc.nextInt();
		for (int i = 1;i<=j;i++) {
			System.out.println(srcadr+i);
		}
	}
	}
}
