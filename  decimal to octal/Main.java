#include<stdio.h>
int main()
{
  //type your code here
  int a[100],i,n,c=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a[c] = n%8;
    n=n/8;
    c++;
  }
  
  for(i=c-1;i>=0;i--)
  {
    printf("%d",a[i]);
  }
  return 0;
}