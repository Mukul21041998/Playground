#include<stdio.h>
int main()
{
  //Type your code here
  int n,v,t,sum;
  scanf("%d",&n);
  v = n%10;
  t = n/10;
  sum = v+t;
  printf("%d",sum);
  return 0;
}