#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
    int a=0,b=0,n;
  cin>>n;
  for(int i=1;i<=n;i++){
  if(i%2==0){
  if(i==2) b=0;
    else{
      b=a/2;
        }
  } else {
       if(i==1) a=0;
    else a=a+2;
       }
  } if(n%2==0) cout<<b;
   else cout<<a;
    return 0;
}