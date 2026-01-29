import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        
        int[] answer = new int[commands.length]; // 배열크기 초기화
        
        for(int idx = 0; idx < commands.length; idx++){
            int i = commands[idx][0];
            int j = commands[idx][1];
            int k = commands[idx][2];
            
            int a[] = Arrays.copyOfRange(array,i-1,j); // i번째 숫자부터 j번째 숫자까지 자르기
            Arrays.sort(a); // 정렬
            
            answer[idx] = a[k-1]; // k번째 수 구하기
        }
        
        return answer;
    }
}