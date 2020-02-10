#include <stdio.h>

int main() {
    
    int a, s; // variable

    printf("Example using variable in c \n");
    printf("Enter length of side : ");

    scanf("%d", &s); // store length in s
    
    printf("the formula a = s * s");
    a = s * s; // calculate area; then store in a
    
    int threshold = 100;

    printf("\n");
    if (s > (threshold+1)) {
       printf("size: %i more than threshold: %i", s, threshold);
    } else if ( s == 100) {
      printf("size: %i equal with threshold: %i", s, threshold);
    } else {
      printf("size: %i less than threshold: %i", s, threshold);       
    }

    printf("\n");

    printf("Area of Square = %d", a);
}