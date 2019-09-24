package pkgCombo;

import java.util.Iterator;

import org.apache.commons.math3.util.CombinatoricsUtils;

public class Main {

	public static void main(String[] args) {
		
		String str = "ABCDE";
		String strBuild = "";
		
		Iterator<int[]> combos = CombinatoricsUtils.combinationsIterator(5, 3);
		
		while (combos.hasNext()) {
			int[] c = combos.next();
			strBuild = "";
			for (int i: c)			
			{
				strBuild = strBuild + str.substring(i,i+1);
			}
			
			System.out.println(strBuild);
		}
	}

}
