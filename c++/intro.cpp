#include <iostream>
#include <cstdio>
using namespace std;

int main() {

    int a, s, threshold = 100;

    cout << "Example using variable in c++ \n" << endl;
    cout << "Enter length of side : ";

    scanf("%d", &s); // store length in s
    
    cout << "the formula a = s * s" << endl;
    a = s * s; // calculate area; then store in a
    cout << endl;

    cout <<"\n";
    if (s > (threshold+1)) {
       cout <<"size:"<< s <<" more than threshold:"<< threshold;
    } else if ( s == 100) {
      cout <<"size:"<< s <<" more than threshold:"<< threshold;
    } else {
      cout <<"size:"<< s <<" more than threshold:"<< threshold;       
    }

    cout << endl;

    cout <<"Area of Square = " << a << endl;

    return 0;
    
}