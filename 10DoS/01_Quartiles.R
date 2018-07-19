data <- file('stdin')
data <- suppressWarnings(readLines(data))
data <- strsplit(data, " ")

for (i in 1:length(data)) {
    data[[i]] <- as.numeric(data[[i]])
}

data_sorted <- sort(data[[2]])

Qlimit_mid <- median(data_sorted)

data_sorted_bottomhalf <- data_sorted[data_sorted < median(data_sorted)]
Qlimit_low <- median(data_sorted_bottomhalf)

data_sorted_tophalf <- data_sorted[data_sorted > median(data_sorted)]
Qlimit_high <- median(data_sorted_tophalf)

write(Qlimit_low, stdout())
write(Qlimit_mid, stdout())
write(Qlimit_high, stdout())
