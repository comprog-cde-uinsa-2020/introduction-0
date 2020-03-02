#include <iostream>
#include "./header/formula.h"

using namespace std;

int main() {

   int iSize = 100;
   float fSize = 100.100;

   cout<<"using header function for integer :> "<< iSquare(iSize) <<"\n";
   cout<<"using header function for float   :> "<< fSquare(fSize) <<"\n";

   return 0;
}
