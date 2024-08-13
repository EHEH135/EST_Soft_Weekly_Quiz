
class Solution {
    public static void main(String[] args){
        Solution my = new Solution();
        // TCs
		// int a = 9;		//TC #1
		// int b = 91;		//TC #1
		// int a = 89;		//TC #2
		// int b = 8;		//TC #2


        // Solution output
		int output = my.solution(a, b);
		System.out.println(output);
    }
    public int solution(int a, int b) {
        int answer;

        String tmpA = combine(a, b);
        String tmpB = combine(b, a);

        answer = compare(tmpA, tmpB);

        return answer;
    }
    static int compare(String a, String b){
        if(Integer.parseInt(a) > Integer.parseInt(b)){
            return Integer.parseInt(a);
        }
        return Integer.parseInt(b);
    }
    static String combine(int a, int b){
        String tmpA = Integer.toString(a);
        String tmpB = Integer.toString(b);

        return (tmpA + tmpB);
    }
}