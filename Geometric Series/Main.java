#include<stdio.h>
#include<math.h>
int main()
{
  int n,res;
  scanf("%d",&n);
  if(n%2==0)
  {
    n=n/2;
    n=n-1;
    res = pow(3,n);
  }
  
  else
  {
    n=(n+1)/2;
    n=n-1;
    res = pow(2,n);
  }
  
  printf("%d", res);
  return 0;
}