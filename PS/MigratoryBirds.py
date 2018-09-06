import math
import os
import random
import re
import sys

def migratoryBirds(arr):
    count = [0, 0, 0, 0, 0]
    
    for i in range(len(arr)):
        if arr[i] == 1:
            count[0] += 1
        if arr[i] == 2:
            count[1] += 1
        if arr[i] == 3:
            count[2] += 1
        if arr[i] == 4:
            count[3] += 1
        if arr[i] == 5:
            count[4] += 1
    
    return count.index(max(count))+1 
            
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr_count = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = migratoryBirds(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
