package com.hanio;

/**
 * 汉诺塔递归实现
 * @author wy
 *
 */
public class Hanio {
	
	private int i = 0;
	
	public void hanioT(int n){
		hanio(n, "A", "B", "C");
	}
	
	/**
	 * 递归实现
	 * @param n
	 * @param from
	 * @param dependOn
	 * @param to
	 */
	public void hanio(int n, String from, String dependOn, String to) {
		
		if(n == 1) {
			move(n, from, to);
		} else {
			//将n-1号盘子从A --> B, 依靠C
			hanio(n - 1, from, to, dependOn);
			//将n号盘子从A --> C
			move(n, from, to);
			//将n-1号盘子从B --> C, 依靠A
			hanio(n - 1, dependOn, from, to);
		}
	}
	
	public void move(int n, String from, String to) {
		
		System.out.printf("第%d步, 将%d号盘子, %s -----> %s", ++i, n, from, to);	
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Hanio hanio = new Hanio();
		hanio.hanioT(3);
	}
}
