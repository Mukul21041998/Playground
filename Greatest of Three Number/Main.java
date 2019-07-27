#include<stdio.h>
int main()
{
  int a , b ,c ,n;
  scanf("%d" , &a);
  scanf(",");
  scanf("%d" , &b);
  scanf(",");
  scanf("%d" , &c);
  if(a>b)
  {
    n=a;
  }
  if(a<b)
  {
    n=b;
  }
 
  if(n<c)
  {
    n=c;
  }
  printf("%d",n);
}