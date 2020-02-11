#include <iostream>
#include <cstdio>
using namespace std;

// function to print array
void printarray (int arg[], int length) {
  for (int n = 0; n<length; ++n)
    cout << arg[n] << ' ';
  cout << '\n';
}

int main() {

    int size; // variable 

    cout << "Enter your length of array: ";
    cin >> size;
    int array[size];

    cout << "show array size "<< size << endl;

    // for loop to input value one by one
    for (int i = 0; i < size; i++) {
      cout << "input index ["<<i<<"] value of array:";
      cin >> array[i];
    }

    cout << "show all of array";
    printarray(array, size);
    
    // for loop to print one by one
    cout << "or show one by one array "<<endl;
    for (int i=0; i < size; i++) {
      cout << "show array by index:["<<i<<"] is value:"<< array[i]<<endl;  
    }

    return 0;    
}