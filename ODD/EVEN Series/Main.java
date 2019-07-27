#include<stdio.h>
int main()
{
	//type your code here
  int n,i,v=2,s;
  scanf("%d",&n);
  if(n%2==0)
  {
    n=n/2;
    
    for(i=0;i<n;i++)
    {
      s = v*i;
    }
    
    s = s/2;
    printf("%d",s);
    
    
    
  }
  
  else
  {
    n=n/2;
    n=n+1;
    for(i=0;i<n;i++)
    {
      s = v*i;
    }
    
    printf("%d",s);
    
  }
	
}