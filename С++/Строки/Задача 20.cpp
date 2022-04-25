#include <iostream>
using namespace std;
 
int main()
{
   char c[256];
    int accumulator = 0;
    cin.getline(c,256);
 
    for (int i = 0; c[i] != 0; i++) {
        if (c[i] >= '0' && c[i] <= '9')
            accumulator++;
    }
    cout << accumulator;
 
    return 0;
}