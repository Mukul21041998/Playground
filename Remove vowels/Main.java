#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  char str2[100];
  int i = 0 , c = 0 , l;
  gets(str);
  l = strlen(str);
  for(i=0;i<l;i++)
  {
    if(str[i]=='a' || str[i]=='e' ||str[i]=='i' || str[i]=='o' || str[i]=='u' ||
      str[i]=='A' || str[i]=='E' || str[i]=='I' || str[i]=='O' || str[i]=='U' )
    {
      continue;
    }
    
    else
    {
      str2[c] = str[i];
      c++;
    }
  }
  
  for(i=0;i<c;i++)
  {
    printf("%c",str2[i]);
  }
  
  return 0;
}