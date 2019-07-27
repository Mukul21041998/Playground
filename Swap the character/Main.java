#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here 
  char v[100],c[100],u[100];
  int i;
  
  gets(v);
  gets(c);
  gets(u);
  
  for(i=0;i<strlen(v);i++)
  {
    if(v[i]=='a'|| v[i]=='e'|| v[i]=='i'|| v[i]=='o'|| v[i]=='u'|| v[i]=='A'|| v[i]=='E'|| v[i]=='I'|| v[i]=='O'|| v[i]=='U')
    {
      v[i] = '$';
    }
  }
  
  
  
   for(i=0;i<strlen(c);i++)
  {
    if(c[i]!='a'&& c[i]!='e'&& c[i]!='i'&& c[i]!='o'&& c[i]!='u'&& c[i]!='A'&& c[i]!='E'&& c[i]!='I'&& c[i]!='O'&& c[i]!='U' && c[i]!=' ')
    {
      c[i] = '#';
    }
  }
  
  
  for(i=0;i<strlen(u);i++)
  {
    if(u[i]>='a' && u[i]<='z')
    {
      u[i] = u[i]-32;
    }
    
  }
  
  strcat(v,c);
  strcat(v,u);
  
 for(i=0 ; i<strlen(v) ; i++)
 {
   if(v[i]==' ')
   {
     continue;
   }
   
   else
   {
     printf("%c",v[i]);
   }
   
 }
  
  
  
 
  
  
}