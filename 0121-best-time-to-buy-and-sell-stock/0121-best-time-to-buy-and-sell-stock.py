class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        res = 0
        minn = float('inf')

        for n in prices:
            minn = min(n, minn)
            res = max(res, n-minn)
        return res