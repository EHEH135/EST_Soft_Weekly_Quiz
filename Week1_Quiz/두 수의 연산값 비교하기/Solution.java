
class Solution {
    public static void main(String[] args){
        Solution my = new Solution();
        // TCs
		// int a = 2;		//TC #1
		// int b = 91;		//TC #1
		int a = 91;		//TC #2
		int b = 2;		//TC #2


        // Solution output
		int output = my.solution(a, b);
		System.out.println(output);
    }
    public int solution(int a, int b) {
        int answer = compare(a, b);
        return answer;
    }
    static int compare(int a, int b){
        int calc1;
        int calc2;
        
        calc1 = Integer.parseInt(Integer.toString(a) +  Integer.toString(b));
        calc2 = 2 * a * b;

        if(calc1 > calc2){
            return calc1;
        }
        return calc2;
    }
}