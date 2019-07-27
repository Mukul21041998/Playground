#include<stdio.h>
int main()
{
	int n1,n2,i,s,gcd;
	scanf("%d %d",&n1,&n2);
	if(n1>n2){
		s=n2;
	}
	else{
		s=n1;
	}
	for(i=1;i<=s;i++){
		if(n1%i==0 && n2%i==0)
		{
			gcd = i;
		}
	}

	printf("%d\n", gcd);

}