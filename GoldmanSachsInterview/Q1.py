def differentTeams(skills):
    num_p = 0
    num_c = 0
    num_m = 0
    num_b = 0
    num_z = 0

    for char in skills:
        if (char == "p"):
            num_p += 1
        elif (char == "c"):
            num_c += 1
        elif (char == "m"):
            num_m += 1
        elif (char == "b"):
            num_b += 1
        elif (char == "z"):
            num_z += 1
    
    return min(num_p, num_c, num_m, num_b, num_z)
