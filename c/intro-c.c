#include <stdio.h>

int main() {
    
    int a, s; // variable

    printf("Example using variable in c \n");
    printf("Enter length of side : ");

    scanf("%d", &s); // store length in s
    
    printf("the formula a = s * s");
    a = s * s; // calculate area; then store in a
    printf("\n");

    printf("Area of Square = %d", a);
}