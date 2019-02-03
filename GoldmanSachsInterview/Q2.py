def playlist(songs):
    #Solution 1: attempting brute force attempt
    #count = 0
    #for i in range(len(songs)):
    #    for j in range(i+1, len(songs)):
    #        if ((songs[i]+songs[j])%60 == 0):
    #            count += 1
    #return count
    ### ==> works but too slow (9/15 test cases)

    #Solution 2: attempting speedup
    #count = 0
    #multiples = 0
    #i = 0
    #while i < len(songs):
    #    if (songs[i]%60 == 0):
    #        multiples += 1
    #        songs.pop(i)
    #    else:
    #        i += 1
    #count += int(0.5*(multiples-1)*multiples)
    #for i in range(len(songs)):
    #    for j in range(i+1, len(songs)):
    #        if ((songs[i]+songs[j])%60 == 0):
    #            count += 1
    #return count 
    ### ==> works but still too slow (10/15 test cases)

    #Solution 3: most optimal solution O(n):
    freq = [0]*60
    ans = 0

    for i in range(len(songs)):
        freq[songs[i]%60] += 1
    
    ans += int(0.5*freq[0]*(freq[0]-1)) #for the remainder 0s

    for i in range(1,30):
        ans += freq[i]*freq[60-i]

    ans += int(0.5*freq[30]*(freq[30]-1)) #for the remainder 30s

    return ans
