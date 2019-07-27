#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char word[100];
  int i,l,c=0;
  gets(word);
  l=strlen(word);
  for(i=0;i<l;i++)
  {
   
    if(word[i]==' ')
      c++;
    
  }
  printf("%d",c+1);
  
  
}