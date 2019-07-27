#include<stdio.h>
int main()
{
  int n1,n2,i,lcm=1;
  scanf("%d %d",&n1,&n2);

  for(i=2;(n1!=1 || n2!=1);i++)
  {

    while(n1%i==0 || n2%i==0)
    {
    	

    	if(n1%i==0 && n2%i==0){
    		n1=n1/i;
    		n2=n2/i;
    		lcm=lcm*i;
    		
    	}

    	else{

               if(n1%i==0)
               {
                 n1=n1/i;
        	    
               }
  
                else
               {
                  n2=n2/i;
                  
    		      
               }

               lcm = lcm*i;
  
            }

    }    
     
  }

  printf("%d\n", lcm);
  return 0;
}
