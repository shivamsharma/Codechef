/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
void func(char* ch)
{
	int i=0;
	for(i=0;i<130;i++)
	ch[i]='\0';
	return;
}
int main()
{
	int tc,i;
	scanf("%d",&tc);
	char dummy;
	char ch[1000100];
	while(tc--)
	{
		char map[130];
		func(map);
		int n;
		scanf("%d",&n);
		for(i=0;i<n;i++)
		{
			scanf("%c",&dummy);
			char c,p;
			scanf("%c %c",&c,&p);
			map[(int)c]=p;
		}
		scanf("%c",&dummy);
		scanf("%s",ch);
		int dot=-1;
		int j=-1;
		for(i=0;i<strlen(ch);i++)
		{
			if(map[(int)ch[i]]!='\0')
			{
				ch[i]=map[(int)ch[i]];
			}
			if(ch[i]=='.')
			dot=1;
		}
		int k=strlen(ch);
		for(i=0;i<strlen(ch);i++)
		{
			if(ch[i]=='0')
			j++;
			else break;
		}
		if(dot==1)
		{
			for(i=strlen(ch)-1;i>=0;i--)
			{
				if(ch[i]=='0')
				k--;
				else break;
			}
		}
		if(k!=0&&ch[k-1]=='.'&&dot==1)
		k--;
		if(j+1!=k)
		{
			for(i=j+1;i<k;i++)
			printf("%c",ch[i]);
		}
		else printf("0");
		printf("\n");
	}
}