#include <stdio.h>
int main() {
	// Type your code here
  char ch;
  scanf("%c",&ch);
  if(ch>='a' && ch<='z')
  {
    ch = ch-32;
  }
  
  else if(ch>='A' && ch<= 'Z')
  {
    ch = ch+32;
  }
  
  printf("%c",ch);
	return 0;
}