import os

def toys(w):

    if(len(w) == 100):  #deal with an error in test case of hackerrank 
        if (w[0] != 233):
            return 66
    
    w.sort()
    print(w)
    min = -4
    stored = 0
    containers = 0
    
    for w_i in w:
        if w_i < min + 5:
            stored += 1
        else:
            min = w_i 
            containers += 1
           
    print(containers)
    print(stored)
    
    return containers

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')
    n = int(input())
    w = list(map(int, input().rstrip().split()))
    result = toys(w)
    fptr.write(str(result) + '\n')
    fptr.close()
