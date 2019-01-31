#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the freqQuery function below.
def freqQuery(queries):
    datadict = {}
    out = []
    for i in range(len(queries)):       
        if (queries[i][0]==1):
            if (queries[i][1] in datadict):
                datadict[queries[i][1]] += 1
            else:
                datadict[queries[i][1]] = 1

        elif (queries[i][0]==2):
            if (queries[i][1] in datadict):
                if (datadict[queries[i][1]] != 0):
                    datadict[queries[i][1]] -= 1

        else:
            if (queries[i][1] in datadict.values()):
                out.append("1")
            else:
                out.append("0")
    return out

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input().strip())

    queries = []

    for _ in range(q):
        queries.append(list(map(int, input().rstrip().split())))

    ans = freqQuery(queries)

    fptr.write('\n'.join(map(str, ans)))
    fptr.write('\n')

    fptr.close()
