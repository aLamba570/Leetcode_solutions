class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        char [] arr = moves.toCharArray();


        for(int i =0; i<arr.length; i++){
            if(arr[i] =='U'){
                y +=1;
            }
            if(arr[i] == 'D'){
                y-=1;
            }

            if(arr[i]=='L'){
                x-=1;
            }

            if(arr[i] == 'R'){
                x+=1;
            }
        }


        if(x==0 && y == 0){
            return true;
        }

        return false;
    }
}