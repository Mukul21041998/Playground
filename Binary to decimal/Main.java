#include<stdio.h>
#include<math.h>
int main()
{
  int n , i , sum = 0,t,c=0;
  scanf("%d",&n);
  while(n!=0)
  {
    t = n%10;
    if(t==1)
    {
      sum = sum + pow(2,c);
    }
    c++;
    n=n/10;
  }
  
  printf("%d",sum);
  
  
  return 0;
}