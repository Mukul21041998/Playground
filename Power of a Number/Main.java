#include <stdio.h>
int main()
{
  	//Your code here      
  int i , base , exp , r=1;
  scanf("%d %d" , &base , &exp);;
  if(exp>=0)
  {
    for(i=1;i<=exp;i++)
    {
      r = r*base;
    }
    printf("%d",r);
  }
  
  else
  {
    printf("Wrong input");
  }
  
    return 0;
}