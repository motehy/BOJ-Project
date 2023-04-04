import java.util.Stack;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<Structure> stack = new Stack<>();
        for(int i=0; i<numbers.length; i++){
            if(stack.isEmpty()){
                stack.push(new Structure(numbers[i], i));
                continue;
            }
            
            while(!stack.isEmpty() && numbers[i] > stack.peek().number){
                Structure top = stack.pop();
                answer[top.idx] = numbers[i];
            }
            stack.push(new Structure(numbers[i], i));
        }
        
        while(!stack.isEmpty()){
            Structure top = stack.pop();
            answer[top.idx] = -1;
        }
        return answer;
    }
}
class Structure{
    int number;
    int idx;
    
    public Structure(int number, int idx){
        this.number = number;
        this.idx = idx;
    }
}