#include<stdio.h>
int main()
{
  //Type your code here
  int n,a=0,b=1,s,i;
  scanf("%d",&n);
  printf("%d ",a);
  printf("%d ",b);
  for(i=0;i<n-2;i++)
  {
    s=a+b;
    printf("%d ",s);
    a=b;
    b=s;
  }
  
  
  return 0;
}