#include <iostream>
#include <unordered_map>
using namespace std;

int main()
{
    unordered_map<string, int> hm;

    // put value
    hm["India"] = 500;
    hm["China"] = 100;
    hm["Australia"] = 50;
    hm["Russia"] = 1000;

    // contains
    if (hm.find("India") != hm.end())
    {
        cout << "India Found" << endl;
    }

    // get
    cout << hm["India"] << endl;

    // remove
    hm.erase("India");

    return 0;
}