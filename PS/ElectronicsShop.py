import os

def getMoneySpent(keyboards, drives, b):
    max_price = -1
    for i in keyboards:
        for j in drives:
            if((i+j) <= b):
                if(i+j > max_price):
                    max_price = i+j
    return max_price
                

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    bnm = input().split()

    b = int(bnm[0])

    n = int(bnm[1])

    m = int(bnm[2])

    keyboards = list(map(int, input().rstrip().split()))

    drives = list(map(int, input().rstrip().split()))

    moneySpent = getMoneySpent(keyboards, drives, b)

    fptr.write(str(moneySpent) + '\n')

    fptr.close()
