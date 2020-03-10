#include <iostream>
using namespace std;
// function for
void plot_waterfall(int rows, int cols, int size) {
    for (int row = rows; row > size; row -= 1) {
        for (int col = cols; col <= row * 2; col += 1)
            cout<<"*";
        cout<<endl;
    }
}
// function do while and while
void plot_up_down(int rows, int cols) {
    int row = rows;
    int col = cols;

    while(row > 0) {
        
        col = 1;
        do {
            cout<<"*";
            col +=1;
        } while(col <= row);
        cout<<endl;
        row -= 1;
    }
}

int main() {

    plot_waterfall(5, 1, 0);
    cout<<endl;
    plot_up_down(5, 0);

    return 0;
}