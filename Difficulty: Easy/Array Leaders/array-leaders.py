class Solution:
    def leaders(self, arr):
        n = len(arr)
        a = arr[-1]
        res = [a]
        
        for i in range(n-2, -1, -1):
            if arr[i] >= a:
                res.append(arr[i])
                a = arr[i]
        
        res.reverse()
        return res


#{ 
 # Driver Code Starts
t = int(input())  # number of test cases
for _ in range(t):
    arr = list(map(int, input().split()))  # input array
    s = Solution().leaders(arr)  # find the leaders

    # Output formatting
    if s:
        print(" ".join(map(str, s)))  # Print leaders in the required order
    else:
        print("[]")  # Print empty list if no leaders are found

    print("~")

# } Driver Code Ends