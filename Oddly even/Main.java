#include <iostream>
using namespace std;
#include<stdlib.h>
int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  long int n;
  cin>>n;  int i=1,sum1=0,sum2=0;
  while(n>0){
  
    if(i%2==0){
    int r=n%10;
      sum1+=r;n=n/10;i++;
    } else{
    int r=n%10;
      sum2+=r;n=n/10;i++;
    }
  } int result=abs(sum1-sum2);
  cout<<result;
    return 0;
}