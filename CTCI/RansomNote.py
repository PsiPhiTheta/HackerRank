#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the checkMagazine function below.
def checkMagazine(magazine, note):
    magazine.sort()
    note.sort()
    for word in note:
        if word not in magazine:
            print("No")
            return False
        else:
            magazine.remove(word)
    print("Yes")
    return True

if __name__ == '__main__':
    mn = input().split()

    m = int(mn[0])

    n = int(mn[1])

    magazine = input().rstrip().split()

    note = input().rstrip().split()

    checkMagazine(magazine, note)
