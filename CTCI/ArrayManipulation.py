#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries): # O(N) solution
    arr = [0]*(n+1)
    ans = 0

    for i in range(len(queries)):
        a = queries[i][0]
        b = queries[i][1]
        k = queries[i][2]
        arr[a] += k
        if (b+1 <= n):
            arr[b+1] -= k

    print(arr)

    count = 0
    
    for i in range(n+1):
        count += arr[i]
        if count > ans:
            ans = count
        
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)

    fptr.write(str(result) + '\n')

    fptr.close()
