#include<stdio.h>
int main()
{
  //type your code here
  char ch;
  scanf("%c",&ch);
  if(ch>='A' && ch<='Z')
  {
    ch = ch+32;
  }
  if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
  {
    printf("Vowel");
  }
  
  else
  {
    printf("Consonant");
  }
  return 0;
}