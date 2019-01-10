#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the missingNumbers function below.
def missingNumbers(arr, brr):
    #arr, brr = list(arr), list(brr)
    diff = []
    for i in brr:
        if i in arr:
            arr.remove(i)
        else:
            diff.append(i)

    diff.sort()

    return diff

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    m = int(input())

    brr = list(map(int, input().rstrip().split()))

    result = missingNumbers(arr, brr)

    fptr.write(' '.join(map(str, result)))
    fptr.write('\n')

    fptr.close()
