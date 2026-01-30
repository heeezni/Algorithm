import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] arr=new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            arr[i] = Integer.toString(numbers[i]);
        }
        
        // 두 String형 숫자를 이어붙이고, 내림차순 정렬
        Arrays.sort(arr, (a,b)->{
            String o1=a+b;
            String o2=b+a;
            
            return o2.compareTo(o1); // 내림차순
        });
        
        // 내림차순 정렬 후 첫 번째가 "0"이면 나머지도 전부 "0"이므로
        if(arr[0].equals("0")){
            return "0";
        }
        
        // 정렬된 문자열 이어붙이기 (StringBuilder 활용)
        StringBuilder answer=new StringBuilder();
        for(String num:arr){
            answer.append(num);
        }
            
        return answer.toString();
    }
}