#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
      int up,low;
    cin >> low >> up;
    for(int i=low; i<=up; i++)
    {
        if(up>=100)
            printf("%03d ",i);
        else if(up>=10)
            printf("%02d ",i);
        else
            printf("%d ",i);
    }
    return 0;
}