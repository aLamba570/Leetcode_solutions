# User function Template for python3

class Solution:
    def longestSubarray(self, arr, k):  
        # code here
        map = {}
        summ = 0
        maxlen = 0
        
        for i in range(0, len(arr)):
            summ += arr[i]
            
            if summ == k:
                maxlen = max(maxlen, i+1)
                
            rem = summ - k
            
            if rem in map:
                length = i - map[rem]
                maxlen= max(maxlen, length)
                
            if summ not in map:
                map[summ] = i
                
        return maxlen
                
    



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input().strip())
    while tc > 0:
        arr = list(map(int, input().strip().split()))
        k = int(input().strip())
        ob = Solution()
        print(ob.longestSubarray(arr, k))
        tc -= 1
        print("~")
# } Driver Code Ends