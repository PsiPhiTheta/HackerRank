import math
import os
import random
import re
import sys

def hackerrankInString(s):
    sub_string = "hackerrank"
    idx = 0
    
    for char in s:
        if char == sub_string[idx]:
            idx+=1
            if idx == len(sub_string):
                return "YES"
    return "NO"

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = hackerrankInString(s)

        fptr.write(result + '\n')

    fptr.close()
