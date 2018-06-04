package YouTube;

import java.util.Scanner;

public class createdir {
	public static void main(String[] args) {
		while(true) {
		String srcadr;
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.println("输入源地址：");
		srcadr = sc.next();
		System.out.println("输入要生成多少个：");
		j = sc.nextInt();
		for (int i = 1;i<=j;i++) {
			System.out.println(srcadr+i);
		}
	}
	}
}
