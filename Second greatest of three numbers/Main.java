#include<stdio.h>
int main()
{
  // Type your code here
  int a,b,c, fg,sg;
  scanf("%d %d %d",&a,&b,&c);
  if(a>b)
  {
    fg = a;
  }
  
  if(a<b)
  {
    fg = b;
  }
  
  if(fg>c)
  {
    sg = c;
  }
  
  if(fg<c)
  {
    sg = fg;
  }
  
  printf("%d",sg);
  
  
}