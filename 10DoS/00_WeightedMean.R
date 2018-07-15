data = scan("/dev/stdin")
size = data[1]
x = data[2:(size+1)]
weights = data[(size+2):(size*2+1)]

sum = 0
for (i in 1:size)
{
  sum = sum + (x[i] * weights[i])
}

weighted_mean = (sum/sum(weights)) 
weighted_mean = sprintf("%.1f",weighted_mean)
cat(weighted_mean)
