/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include<iostream>
#include <string.h>
using namespace std;
#include<cstdio>
void func(char* ch)
{
	for(int i=0;i<130;i++)
	ch[i]='\0';
	return;
}
int main()
{
	int tc,i;
	scanf("%d",&tc);
	char dummy;
	while(tc--)
	{
		char map[130];
		func(map);
		int n;
		scanf("%d",&n);
		for(i=0;i<n;i++)
		{
			char c,p;
			cin>>c>>p;
			map[(int)c]=p;
		}
		/*for(i=0;i<130;i++)
		printf("%c \n",map[i]);*/
		string ch;
		cin>>ch;
		int dot=-1;
		int j=-1;
		for(i=0;i<ch.length();i++)
		{
			if(map[(int)ch[i]]!='\0')
			{
				ch[i]=map[(int)ch[i]];
			}
			if(ch[i]=='.')
			dot=1;
		}
		int k=ch.length();
		for(i=0;i<ch.length();i++)
		{
			if(ch[i]=='0')
			j++;
			else break;
		}
		if(dot==1)
		{
			for(i=ch.length()-1;i>=0;i--)
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
			cout<<ch[i];
		}
		else printf("0");
		cout<<endl;
	}
}