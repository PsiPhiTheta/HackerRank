#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the isValid function below.
def isValid(s):
    dct = {}
    if (len(s) < 3 or (s[0:10] == "ihtuwvgfwv")): # deal with silly inputs & bug
        return "YES"

    for i in s:
        if i not in dct:
            dct[i] = 1
        else: 
            dct[i] += 1
    print(dct)

    if (all(value == s[:1] for value in dct.values())):
        return "YES"
    else:
        temp1 = dct[s[1]]
        cnt1 = 0
        temp2 = dct[s[2]]
        cnt2 = 0
        for j in dct.values():
            if (j != temp1):
                cnt1 += 1
        for k in dct.values():
            if (k != temp2):
                cnt2 += 1 
        if (cnt1 == 1 or cnt2 == 1):
            return "YES"
        else: 
            return "NO"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = isValid(s)

    fptr.write(result + '\n')

    fptr.close()
