#include <iostream>
using namespace std;
#include<cstring>
int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  string input; cin>>input;
  int count=1,i=1;
  int len=input.length();
  if(len>20) {
  cout<<"Invalid Input"; return 0;
  } else{
  while(len>0){
  if(input[i]==input[i-1]){
  count++;}
    else{
    cout<<input[i-1]<<count;
      count=1;
      
    }i++;len--;
  } 
   }
    return 0;
}