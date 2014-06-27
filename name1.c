/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#define SIZE 40001
/*for(k=0;k<26;k++)
		{
			char ch ='a'+k;
			printf("%c-%d\t",ch,arr[k]);
		}*/
void concat(char *c1,char *c2,int *a)
{
	int i,j;
	i=j=0;
	while(c1[i]!='\0'||c2[j]!='\0')
	{
		a[c1[i]-'a']++;
		a[c2[j]-'a']++;
		if(c1[i]!='\0')
		i++;
		if(c2[j]!='\0')
		j++;
	}
}
	
int main()
{
	int t,i,j,k,flag;
	scanf("%d",&t);
	char a[SIZE],b[SIZE];
	int n,len;
	while(t--)
	{
		int arr[26]={0};
		fflush(stdin);
		len=0,flag=0;
		scanf("%s%s",a,b);
		concat(a,b,arr);
		scanf("%d",&n);
		for(i=0;i<n;i++)
		{
			scanf("%s",a);
			j=0;
			while(a[j]!='\0')
			{
				arr[a[j]-'a']--;
				if(arr[a[j]-'a']<0)
				{
					flag=1;
				}
				j++;
			}
		}
		if(flag==1)
		printf("NO\n");
		else printf("YES\n");
	}
	return 0;
}