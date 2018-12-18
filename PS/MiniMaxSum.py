#!/bin/python3

import math
import os
import random
import re
import sys

def miniMaxSum(arr):
    arr.sort()
    out1 = arr[0]+arr[1]+arr[2]+arr[3]
    out2 = arr[1]+arr[2]+arr[3]+arr[4]
    print(out1, out2)

if __name__ == '__main__':
    arr = list(map(int, input().rstrip().split()))

    miniMaxSum(arr)
