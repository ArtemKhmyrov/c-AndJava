#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
    ifstream in("input.txt");
    ofstream out("output.txt");
    if (in && out)
    {
        string s;
        int n = 1;
        while (getline(in, s))
        {
            if (n % 2 == 1)
                out << s << endl;

            n++;
        }
        in.close();
        out.close();
    }
    system("pause");
    return 0;
}
