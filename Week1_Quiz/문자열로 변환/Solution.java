
class Solution {
    public static void main(String[] args){
        Solution my = new Solution();
        // TCs
		int n = 123;		//TC #1
		//int n = 2573;		//TC #2


        // Solution output
		String output = my.solution(n);
		System.out.println(output);
    }
    public String solution(int n) {
        String answer;

        answer = Integer.toString(n);

        return answer;
    }
}