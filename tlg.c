/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,t;
	scanf("%d",&t);
	int p1=0,p2=0,pname;
	int tc1,tc2;
	int max=0,maxim,sub=0;
	scanf("%d%d",&tc1,&tc2);
	p1+=tc1;	p2+=tc2;
	sub=p1-p2;
	maxim=sub;
	if(sub<0)
	maxim=-sub;
	max=maxim;
	if(sub<0)
	pname=2;
	else pname=1;
	for(i=1;i<t;i++)
	{
		scanf("%d%d",&tc1,&tc2);
		p1+=tc1;	p2+=tc2;
		sub=p1-p2;
		maxim=sub;
		if(sub<0)
		maxim=-sub;
		if(max<maxim)
		{
			max=maxim;
			if(sub<0)
			pname=2;
			else pname=1;
		}
	}
	printf("%d %d\n",pname,max);
	return 0;
}