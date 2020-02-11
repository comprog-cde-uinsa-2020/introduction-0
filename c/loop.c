#include <stdio.h>

// function to print array
void printarray (int arg[], int length) {
  for (int n = 0; n<length; ++n)
    printf("%d ",arg[n]);
  printf("\n");
}

int main() {
    
    int size; // variable 

    printf("Enter your length of array: ");
    scanf("%d",&size);
    int array[size];

    printf("show array size: %d", size);
    printf("\n");

    // for loop to input value one by one
    for (int i = 0; i < size; i++) {
      printf("input index [%d] value of array:", i);
      scanf("%d", &array[i]);
      printf("\n");
    }

    printf("show all of array :");
    printarray(array, size);
    printf("\n");
    
    // for loop to print one by one
    printf("or show one by one array \n");
    for (int i=0; i < size; i++) {
      printf("show array by index:[%d] is value: %d \n",i ,array[i]);
    }
}