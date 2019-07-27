#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float os , as, hyp,v;
  scanf("%f %f",&os,&as);
  v = os*os + as*as;
  hyp = sqrt(v);
  printf("%.2f",hyp);
  return 0;
}