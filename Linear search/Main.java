#include<stdio.h>
int main()
{
  //Type your code here
  int size ,  possition  , i , element;
  int a[100];
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d ",&a[i]);
  }
  scanf("%d",&element);
  for(i=0;i<size;i++)
  {
    if(a[i]==element)
    {
      possition = i+1;
      break;
    }
      
  }
  
  if(i!=size)
  {
    printf("%d",possition);
  }
  
  else
  {
    printf("%d isn't present in the array.",element);
  }
  
  return 0;
}