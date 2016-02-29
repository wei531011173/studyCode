package com.hanio;

/**
 * ��ŵ���ݹ�ʵ��
 * @author wy
 *
 */
public class Hanio {
	
	private int i = 0;
	
	public void hanioT(int n){
		hanio(n, "A", "B", "C");
	}
	
	/**
	 * �ݹ�ʵ��
	 * @param n
	 * @param from
	 * @param dependOn
	 * @param to
	 */
	public void hanio(int n, String from, String dependOn, String to) {
		
		if(n == 1) {
			move(n, from, to);
		} else {
			//��n-1�����Ӵ�A --> B, ����C
			hanio(n - 1, from, to, dependOn);
			//��n�����Ӵ�A --> C
			move(n, from, to);
			//��n-1�����Ӵ�B --> C, ����A
			hanio(n - 1, dependOn, from, to);
		}
	}
	
	public void move(int n, String from, String to) {
		
		System.out.printf("��%d��, ��%d������, %s -----> %s", ++i, n, from, to);	
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Hanio hanio = new Hanio();
		hanio.hanioT(3);
	}
}
