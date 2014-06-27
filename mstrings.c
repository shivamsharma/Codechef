/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <string.h>
int main()
{
	int i,j,l,tc,flag;
	scanf("%d",&tc);
	while(tc--)
	{
		flag=0;
		char s[12];
		scanf("%s",s);
		for(i=0,j=strlen(s)-1;i<strlen(s)/2;j--,i++)
		{
			if(s[j]!=s[i])
			{
				flag=11;
				break;
			}
		}
		if(flag==11)
		printf("NO\n");
		else printf("YES\n");
	}
	return 0;
}
			