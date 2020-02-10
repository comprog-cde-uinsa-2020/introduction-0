def rectangle(s)
    return (s * s)    
end

puts "Example using variable in ruby \n"
puts "Enter length of side : "

input = gets # store length in s
s = input.to_i

puts "the formula a = s * s"

a = rectangle(s) # calculate area; then store in a
threshold = 100

puts "\n"
if s > threshold+1
  puts "size: #{s} more than threshold: #{threshold}"
elsif s == 100
  puts "size: #{s} equal with threshold: #{threshold}"
else 
  puts "size: #{s} less than threshold: #{threshold}"       
end

puts "\n"

puts "Area of Square = #{a}"