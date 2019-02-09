import math
import os
import random
import re
import sys

def sherlockAndAnagrams(s):
    dct = {} 
    cnt = 0

    for i in range(len(s)):
        for j in range(i+1,len(s)+1):
            list1 = list(s[i:j].strip()) # extract all substrings, convert to list
            print(list1)
            list1.sort() # sort to ensure dict counts in order
            substr = ''.join(list1) # convert back to string
            #print(substr)
            if substr in dct:  # if true this means new anagram pair(s) possible
                cnt += dct[substr] # for each new instance of existing substring, we can make as many new anagrams as the number of those already present anagrams (since you can make an extra pair with each already-present anagram)
                dct[substr] += 1 # increment dict count
            else: 
                dct[substr] = 1   # increment dict count of new substr    
    print(dct)
    return cnt    

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    q = int(input())

    for q_itr in range(q):
        s = input()

        result = sherlockAndAnagrams(s)

        fptr.write(str(result) + '\n')

    fptr.close()
