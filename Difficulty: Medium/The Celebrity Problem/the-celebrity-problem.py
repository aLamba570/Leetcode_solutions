class Solution:
    def celebrity(self, mat):
        # code here
        n = len(mat)
        
        can = 0
        for i in range(1,n):
            if mat[can][i] == 1:
                can = i
                
        for i in range(n):
            if i!=can:
                if mat[can][i] == 1 or mat[i][can]==0:
                    return -1
                    
        return can
            