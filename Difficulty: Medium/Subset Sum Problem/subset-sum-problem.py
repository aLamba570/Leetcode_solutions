class Solution:
    def isSubsetSum(self, arr, target):
        n = len(arr)
        
        def recursive(arr, n, target):
            if target == 0:
                return True
            if n == 0:
                return False

            if arr[n - 1] <= target:
                return (recursive(arr, n - 1, target - arr[n - 1]) or
                        recursive(arr, n - 1, target))
            else:
                return recursive(arr, n - 1, target)
        
        return recursive(arr, n, target)
