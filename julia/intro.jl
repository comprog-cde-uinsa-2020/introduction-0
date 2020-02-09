print("Example using variable in julia \n")
print("Enter length of side : ")

s = readline() # store length in s

print("the formula a = s * s")
print("the formula a = $s * $s")
a = parse(Float64, s) * parse(Float64, s) # calculate area then store in a
print("\n")

print("Area of Square = $a")