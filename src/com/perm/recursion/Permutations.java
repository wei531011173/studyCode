package com.perm.recursion;

/**
 * 字符串全排列递归实现方案
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
					//从第一个数做起, 将第一个固定, 对后面的数进行全排列
					swap(charArr, start, i);
					//对剩下的数进行全排列
					perm(charArr, start + 1, end);
					//复原,为了将后面的数换成第一个, 固定
					swap(charArr, start, i);
				}
			}
		}
		
	}
	
	/**
	 * 交换位置
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
	 * 检测是否有重复的数字.
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
