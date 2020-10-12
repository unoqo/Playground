#include<iostream>
using namespace std;
int main()
{ 
  int a=1,b=1,n;
  cin>>n;
  for(int i=1;i<=n;i++){
  if(i%2==0){
  if(i==2) b=1;
    else{
      b=b*3;
        }
  } else {
       if(i==1) a=1;
    else a=a*2;
       }
  } if(n%2==0) cout<<b;
   else cout<<a;
return 0;
}