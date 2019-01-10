#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the marsExploration function below.
def marsExploration(s):
    errors = 0
    message = []
    length = int(len(s)/3.0)
    for i in range(length):
        message.append("SOS")
    original = ''.join(message)


    if (original == s):
        errors = 0
    else:
        for char_s, char_o in zip(s, original):
            if (char_s != char_o):
                errors += 1
    
    return errors

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    result = marsExploration(s)

    fptr.write(str(result) + '\n')

    fptr.close()
