/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,j,k,tc;
	scanf("%d",&tc);
	while(tc-->0)
	{
		int G;
		scanf("%d",&G);
		int I,N,Q;
		for(j=0;j<G;j++)
		{
			scanf("%d%d%d",&I,&N,&Q);
			printf("%d\n",I==Q?(N/2):(N-N/2));
		}
	}
	return 0;
}