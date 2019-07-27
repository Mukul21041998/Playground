#include<stdio.h>
int main()
{
	//your code here
  long int fact=1,n;
  scanf("%ld",&n);
  while(n!=0)
  {
    fact = fact*n;
    n--;
  }
  printf("%ld",fact);
}