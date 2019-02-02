#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the alternatingCharacters function below.
def alternatingCharacters(s):
    cnt = 0
    if (s[:1] == "A"):
        prev = "B"
    else:
        prev = "A"
    for i in s:
        if (i == prev):
            cnt += 1
        else:
            prev = i 
    return cnt
        
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = alternatingCharacters(s)

        fptr.write(str(result) + '\n')

    fptr.close()
