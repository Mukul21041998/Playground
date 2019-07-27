#include<stdio.h>
int main()
{
  int n,emt1,emt2,emtIndex1=-1,emtIndex2=-1,i;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d %d" , &emt1 , &emt2);
  
  for(i=0;i<n;i++)
  {
    if(a[i]==emt1 && emtIndex1==-1)
    {
      emtIndex1 = i;
    }
  }
  
  printf("Element 1 index = %d\n" , emtIndex1);
  
   for(i=0;i<n;i++)
  {
    if(a[i]==emt2 && emtIndex2==-1)
    {
      emtIndex2 = i;
    }
  }
  printf("Element 2 index = %d\n" , emtIndex2);
  
}