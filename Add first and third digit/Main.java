#include<stdio.h>
int main()
{
  int firstDigit , thirdDigit,sum,num;
  scanf("%d",&num);
  thirdDigit = num%10;
  firstDigit = num/100;
  sum = firstDigit+thirdDigit;
  printf("%d",sum);
  
  
  
  
  return 0;
}