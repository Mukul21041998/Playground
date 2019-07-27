#include<stdio.h>

int main()
{
  // Type your code here
  int a,b,c,d,s1,s2,s;
  scanf("%d %d %d %d",&a,&b,&c,&d);
  s1=a<b?a:b;
  s2=c<d?c:d;
  s=s1<s2?s1:s2;
  printf("%d",s);
    
}