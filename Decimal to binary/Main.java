#include<stdio.h>
int main()
{
  //Type your code here
  int n,v[1000],c=0,i,a=1;
  scanf("%d",&n);
  while(n!=1)
  {
    v[c]=n%2;
    c++;
    n=n/2; 
  }
  
  printf("%d",a);
  
  for(i=c-1;i>=0;i--)
  {
    printf("%d",v[i]);
  }
  
  return 0;
}