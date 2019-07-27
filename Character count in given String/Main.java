#include<stdio.h>
#include<string.h>
int main()
{
	//type your code here
  char a[100];
  int i , c=0 , l;
  gets(a);
  l = strlen(a);
  if(l>20)
  {
    printf("Invalid Input");
  }
  
  else
  {
     for(i=0;i<l;i++)
  {
    if(a[i]==a[i+1])
    {
      c++;
    }
    else
    {
      printf("%c%d",a[i],c+1);
      c=0;
    }
  }
  }
 
}