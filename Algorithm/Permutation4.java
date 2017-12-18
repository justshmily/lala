package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 已知两个非负整数n和k（n>=k），列出集合S={a1，a2，~，an}的所有k组合
 * @author JH
 *
 */
public class Permutation4 {
	private static int n;
	private static int k;
	private static int count =0;
	private int[] list;
	private List<Integer> tmp = new ArrayList<>();
	
	public Permutation4(int n,int k){
		this.n=n;
		this.k=k;
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = (int) (Math.random()*20);
			System.out.print(list[i]+" ");
		}
		Arrays.sort(list);
		zuhe(0, tmp, list);
		System.out.println(count+"种组合");
	}
	private static void zuhe(int curIdx, List<Integer> tmp, int[] list) {
		if (curIdx <= list.length&&tmp.size()==k) {
			System.out.println(tmp);
			count++;
		}
		for (int i = curIdx; i < list.length; i++) {
			if (i > curIdx && list[i] == list[i - 1])
				continue;
			tmp.add(list[i]);
			zuhe(i + 1, tmp, list);
			tmp.remove(tmp.size() - 1);
		}
	}

	public static void main(String[] args) {
		Permutation4 p=new Permutation4(6,3);
	}
}
