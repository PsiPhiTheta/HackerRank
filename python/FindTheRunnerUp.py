if __name__ == '__main__':
    
    n = int(input())
    arr = list(map(int, input().split()))
    
    a = set(arr)
    a = sorted(a)
    n = len(a)
    
    print(a[n-2])
