#include<stdio.h>
int main()
{
  	//type your code here
  int i,n,t;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n-1;i++)
  {
    if(a[i]>a[i+1])
    {
      t = a[i];
      a[i]=a[i+1];
      a[i+1]=t;
    }
  }
  
  printf("%d",a[i]);
  
}