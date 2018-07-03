#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the solve function below.
def solve(meal_cost, tip_percent, tax_percent):
    tip = (float(tip_percent)/float(100.0))*float(meal_cost)
    tax = (float(tax_percent)/float(100.0))*float(meal_cost)
    result = round(float(meal_cost + float(tip) + float(tax)))
    
    print("The total meal cost is "+str(int(result))+" dollars.") 
    
if __name__ == '__main__':
    meal_cost = float(input())

    tip_percent = int(input())

    tax_percent = int(input())

    solve(meal_cost, tip_percent, tax_percent)
