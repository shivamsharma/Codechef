/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
	int i,t,j,op;
	scanf("%d",&t);
	char str[402];
	char oper[400];
	for(i=0;i<t;i++)
	{
		scanf("%s",str);
		op=-1;
		for(j=0;j<strlen(str);j++)
		{
			if(str[j]=='(')
			{
				continue;
			}
			else if(str[j]=='*'||str[j]=='+'||str[j]=='-'||str[j]=='/'||str[j]=='^')
			{
				op++;
				oper[op]=str[j];
			}
			else if(str[j]==')')
			{
				printf("%c",oper[op]);
				op--;
			}
			else
			{
				printf("%c",str[j]);
			}
		}
		printf("\n");
	}
	return 0;
}