def minNum(A, K, P):
    if (K <= A):
        return -1
    else:
        return (math.ceil((P+1)/(K-A)))
