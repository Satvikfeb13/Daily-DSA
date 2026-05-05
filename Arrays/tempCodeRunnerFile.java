
        int bestending=arr[0];
        for(int i=1;i<arr.length;i++){
            int v1=arr[i];
            int v2=bestending+arr[i];
            bestending=Math.min(v1, v2);
            result=Math.min(result, bestending);
        }
        System.out.println(result);