import math
import os
import random
import re
import sys

def camelcase(s):
    out = 1
    for char in s:
        if char.isupper():
            out += 1
    return out

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = camelcase(s)

    fptr.write(str(result) + '\n')

    fptr.close()
