#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countTriplets function below.
def countTriplets(arr, r):
    if (len(arr) < 3): # deal with silly inputs
        return 0

    dct_single = {}
    dct_pairs = {}
    cnt = 0

    for x in arr[::-1]: # backward traversal to avoid div
        r_x = r*x
        r_r_x = r*r_x
        cnt += dct_pairs.get((r_x, r_r_x), 0) # x is i -> inc cnt (if present)
        dct_pairs[(x,r_x)] = dct_pairs.get((x,r_x), 0) + dct_single.get(r_x, 0) # x is j -> fix vals in dict 
        dct_single[x] = dct_single.get(x, 0) + 1 # x is k -> fix vals in dict
      
    return cnt

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nr = input().rstrip().split()

    n = int(nr[0])

    r = int(nr[1])

    arr = list(map(int, input().rstrip().split()))

    ans = countTriplets(arr, r)

    fptr.write(str(ans) + '\n')

    fptr.close()
