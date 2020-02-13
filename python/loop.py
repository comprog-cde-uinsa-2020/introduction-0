# function to print array by index
def print_array(data):
  for i in range(len(data)):
    print("index[{}] value of {}".format(i, data[i]))
  print("\n")

if __name__ == "__main__":

    # variable
    data = [] #array
    print("Example your length of array in python \n")
    size = int(input("Input size of array : "))

    # loop 
    for i in range(size):
        value = int(input("value of array [{}]".format(i)))
        data.append(value)
    
    print("array >> {}".format(data))# print all in array
    print_array(data)