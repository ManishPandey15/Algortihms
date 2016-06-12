/*Given a string pattern of 0s, 1s, and ?s (wildcards), generate all 0-1 strings that match this pattern. 
e.g. 1?00?101 -> [10000101, 10001101, 11000101, 11001101]. 
You can generate the strings in any order that suits you.*/

package algorithms.backtracking.chapter9;

public class BacktrackingProblem7 {

	private void regularExpression(String inputPattern, int index) {

		if (index == inputPattern.length()) {
			System.out.println("Possible Pattern-->   " + inputPattern);
		} else if (inputPattern.charAt(index) == '?') {
			StringBuilder s1 = new StringBuilder(inputPattern);
			s1.setCharAt(index, '0');
			regularExpression(s1.toString(), index + 1);
			s1.setCharAt(index, '1');
			regularExpression(s1.toString(), index + 1);
		} else {
			regularExpression(inputPattern, index + 1);
		}
	}

	public static void main(String[] args) {
		String s = "1?1?";
		BacktrackingProblem7 prob7 = new BacktrackingProblem7();
		prob7.regularExpression(s, 0);

	}

}
