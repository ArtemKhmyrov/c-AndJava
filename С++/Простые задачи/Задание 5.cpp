#include <iostream>
#include <string>
 
using namespace std;
 
int main(void)
{
    string name;
    getline(cin, name);
 
    for (int i = 0; i < name.length(); i++)
        cout << name[i] << "\n";
 
    system("pause");
    return 0;
}