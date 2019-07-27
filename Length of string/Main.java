#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char str[100];
  
  gets(str);
  int l = strlen(str);
  printf("%d",l);
  
  return 0;
}