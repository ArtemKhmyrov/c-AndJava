#include <iostream>
#include <string>
#include <regex>
using namespace std;

int main(int argc, char* argv[])
{
	string line;
	getline(cin, line);

	int s = 0;
	for_each(line.begin(), line.end(), [&s](char c)
		{
			if (isdigit(c))
			{
				s += (c - '0');
			}
		});

	cout << s << endl;
	return 0;
}