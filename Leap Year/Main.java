#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n;
  cin>>n;
  if(n%400==0)
    cout<<"LEAP YEAR"<<endl;
  else if(n%100==0)
    cout<<"NOT LEAP YEAR"<<endl;
  else if(n%4==0) cout<<"LEAP YEAR"<<endl;
  else cout<<"NOT LEAP YEAR"<<endl;
    return 0;
}