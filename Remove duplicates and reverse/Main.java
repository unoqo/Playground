#include <iostream>
#include<cstring>
using namespace std;
void reverse(char input[]){
int len=strlen(input);
  int i=0,j=len-1;
  while(i<=j){
  char temp=input[i];
  input[i]=input[j];
    input[j]=temp;i++;j--;
  }
}
void removeduplicate(char input[]){
char lastchar=input[0];
  int k=1;
  for(int i=1;input[i]!='\0'; ){
  if(input[i]==lastchar) i++;
    else if(input[i]!=lastchar){
    input[k]=input[i];i++;
    lastchar=input[k];k++;
    }
  } input[k]='\0';
}

int main() 
{
   // Try out your code here
   // cout << "Hello, World!";
  char input[30];cin>>input;
  removeduplicate(input);
  reverse(input);
  cout<<input;
    return 0;
}