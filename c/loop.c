#include <stdio.h>
#include "printarray.h"

int main() {
    
    int size; // variable 

    printf("Enter your length of array: ");
    scanf("%d", &size);
    // int array[size];
    float farray[] = { 0.0};

    printf("show array size: %d", size);
    printf("\n");

    // for loop to input value one by one
    for (int i = 0; i < size; i++) {
      printf("input index [%d] value of array:", i);
      scanf("%d", &farray[i]);
      printf("\n");
    }

    printf("show all of array :");
    printArray(farray, size);
    printf("\n");
    
    // for loop to print one by one
    printf("or show one by one array \n");
    for (int i=0; i < size; i++) {
      printf("show array by index:[%d] is value: %d \n",i ,farray[i]);
    }
}