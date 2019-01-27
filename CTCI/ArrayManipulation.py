#!/bin/python3

import math
import os
import random
import re
import sys

# Naive approach
def arrayManipulation(n, queries): 
    
    array = [0]*n

    print(array)
    print(queries)

    for i in range(len(queries)):
        for j in range(queries[i][1]-queries[i][0]+1):
            array[queries[i][0]+j-1] += queries[i][2]

    print(array)

    return max(array)

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
