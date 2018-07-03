#!/bin/python3

import math
import os
import random
import re
import sys



if __name__ == '__main__':
    N = int(input())
    if N % 2 == 0:
        if N < 5:
            print("Not Weird")
        if N > 20:
            print("Not Weird")
        if N > 5 and N < 21:
            print("Weird")
    if N % 2 == 1:
        print("Weird")
