
class Solution {
    public static void main(String[] args){
        Solution my = new Solution();
        // TCs
		String my_string = "string";		//TC #1
		int k = 3;		//TC #1
		//String my_string = "love";		//TC #2
		//int k = 10;		//TC #2


        // Solution output
		String output = my.solution(my_string, k);
		System.out.println(output);
    }
    public String solution(String my_string, int k) {
        String answer = "";

        for(int i = 0; i < k; i++){
            answer += my_string;
        }

        return answer;
    }
}