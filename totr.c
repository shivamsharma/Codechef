/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
	int i,j,k,flag,t;
	char str[27],ch[102];
	scanf("%d%s",&t,str);
	for(i=0;i<t;i++)
	{
		scanf("%s",ch);
		for(j=0;j<strlen(ch);j++)
		{
			flag=0;
			if(ch[j]=='_')
			ch[j]=' ';
			else
			if(ch[j]<=90&&ch[j]>=65)
			{
				ch[j]+=32;
				flag=1;
			}
			if(ch[j]>=97&&ch[j]<=122)
			ch[j]=str[ch[j]-'a'];
			if(flag==1)
			ch[j]-=32;
		}
		printf("%s\n",ch);
	}
	return 0;
}
				