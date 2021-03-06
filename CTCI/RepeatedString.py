import math
import os
import random
import re
import sys

def repeatedString(s, n):
    count1 = s.count("a")
    count2 = s[0:(n%len(s))].count("a")
    return ((n//len(s))*count1 + count2)
  
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    n = int(input())

    result = repeatedString(s, n)

    fptr.write(str(result) + '\n')

    fptr.close()
