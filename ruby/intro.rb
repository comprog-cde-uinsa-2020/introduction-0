puts "Example using variable in c \n"
puts "Enter length of side : "

s = gets; # store length in s

puts "the formula a = s * s"
a = (s.to_i * s.to_i) # calculate area; then store in a
puts "\n"

puts "Area of Square =", a