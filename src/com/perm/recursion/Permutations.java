package com.perm.recursion;

/**
 * �ַ���ȫ���еݹ�ʵ�ַ���
 * @author wy
 *
 */
public class Permutations {
	
	public void perm(char[] charArr, int start, int end) {
		
		if(start == end){
			System.out.println(String.valueOf(charArr));
			
		} else {
			
			for(int i = start; i <= end; i++) {
				
				if(isSwap(charArr, start, i)) {
					//�ӵ�һ��������, ����һ���̶�, �Ժ����������ȫ����
					swap(charArr, start, i);
					//��ʣ�µ�������ȫ����
					perm(charArr, start + 1, end);
					//��ԭ,Ϊ�˽�����������ɵ�һ��, �̶�
					swap(charArr, start, i);
				}
			}
		}
		
	}
	
	/**
	 * ����λ��
	 * @param charArr
	 * @param pos1
	 * @param pos2
	 */
	public void swap(char[] charArr, int pos1, int pos2) {
		
		char c1 = charArr[pos1];
 		charArr[pos1] = charArr[pos2];
		charArr[pos2] = c1;
		
	}
	
	/**
	 * ����Ƿ����ظ�������.
	 * @param charArr
	 * @param nBegin
	 * @param nEnd
	 * @return
	 */
	public boolean isSwap(char[] charArr, int nBegin, int nEnd)  
	{  
	       for (int i = nBegin; i < nEnd; i++)
	       if (charArr[i] == charArr[nEnd])
	             return false;
	       return true;
	} 
	
	public static void main(String[] args) {
		
		Permutations p = new Permutations();
		char[] arr = new char[]{'b', 'a','b'};
		p.perm(arr, 0, arr.length - 1);
		
	}

}
