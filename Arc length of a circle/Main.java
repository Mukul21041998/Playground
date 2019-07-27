#include<stdio.h>
int main()
{
  float radius , angle,arc;
  scanf("%f %f",&radius , &angle);
  arc = 2*3.14*radius*(angle/360);
  printf("%.2f",arc);
  
  return 0;
}