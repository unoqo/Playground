#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  long int n,f=1;
  cin>>n;
  for(long int i=1;i<=n;i++)
    f*=i;
  cout<<f;
    return 0;
}