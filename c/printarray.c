#include <stdio.h>
// function to print array
void printArray (float arg[], int length) {
  for (int n = 0; n < length; n++){
    printf("%f ", arg[n]);
  }
  printf("\n");
}