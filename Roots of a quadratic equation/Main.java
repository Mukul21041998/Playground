#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b,c,d;
  float root1,root2,real,imag;
  scanf("%f\n%f\n%f",&a,&b,&c);
  d=b*b-(4*(a*c));
  if(d<0)
  {
    real = (-b)/(2*a);
    imag = (sqrt(-d))/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi", real, imag, real ,imag);
  }
  
  else
  {
  d=sqrt(d);
  root1=(-b+d)/2*a;
  root2=(-b-d)/2*a;
  printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
   
}
