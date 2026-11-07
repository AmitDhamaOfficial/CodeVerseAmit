#include <iostream>
#include <unordered_map>
using namespace std;

int main()
{
    unordered_map<string,int> hm;

    hm["India"] = 100;
    hm["China"] = 50;
    hm["USA"] = 70;

    hm["India"] = 110;

    if(hm.find("India") != hm.end())
    {
        cout << "India Found\n";
    }


  }