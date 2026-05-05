import java.util.HashMap;
import java.util.Map;

class MajorityElement{
    public static void main(String[] args) {
        int [] arr={1, 1, 1, 2, 1, 2};        int n= arr.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            if(cnt>n/2){
                System.out.println(cnt);
                break;
            }
        }

        HashMap<Integer,Integer>map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getKey()>n/2){
                System.out.println(entry.getValue());
                break;
            }
        }
        
    }
}