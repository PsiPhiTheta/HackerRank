def oddNumbers(l, r):
    list = []
    for i in range(l, (r+1)):
        if (i%2 != 0):
            list.append(i)
            
    return list
    
