#include <stdio.h>

int main() {
    
    int a, s; // variable

    printf("Enter length of side");

    scanf("%d", &s); // store length in s
    
    a = s * s; // calculate area; then store in a
    
    printf("\n Area of Square", a);
}