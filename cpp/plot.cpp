#include <iostream>
#include <cstdlib>
#include <random>

using namespace std;

void plot_random() {
    random_device rd;
    default_random_engine randengine(rd());

    uniform_real_distribution<> dist(-10, 10);

    cout<<"% X Y \n";

    for (int i = 0; i < 200; ++i) {
        cout<<dist(randengine)<<' '<<dist(randengine)<<'\n';
    }
}

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
    cout<<endl;
    plot_random();

    return 0;
}