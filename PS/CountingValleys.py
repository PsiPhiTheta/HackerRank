import os

def countingValleys(n, s):
    altitude = 0
    valleys = 0
    for i, char in enumerate(s):
        if (char == "D"):
            altitude -= 1
        else:
            altitude += 1
            if altitude == 0:
                valleys += 1

    return valleys
        
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)

    fptr.write(str(result) + '\n')

    fptr.close()
