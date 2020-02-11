# function
def rectangle(s):
  return s*s

if __name__ == "__main__":

    print("Example using variable in python \n")
 
    s = int(input("Enter length of side : "))
    print("the formula a = s * s")

    # variable
    a = rectangle(s) # calculate area; then store in a and also are variable
    
    # branching => if elif else
    threshold = 100
    
    if (s > (threshold+1)):
      print("size: {} more than threshold: {}".format(s, threshold))
    elif( s == threshold):
      print("size: {} equal with threshold: {}".format(s, threshold))
    else:
      print("size: {} less than threshold: {}".format(s, threshold))
    
    print("\n")

    print("Area of Square = {}".format(a))