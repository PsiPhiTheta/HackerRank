# Enter your code here. Read input from STDIN. Print output to STDOUT

n = input()
test = input().strip().split() 

if len(set(test)) == len(test):
    print("YES")
else:
    print("NO")
