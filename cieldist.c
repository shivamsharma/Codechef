/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
int main()
{
	int i,t;
	scanf("%d",&t);
	int D,Ds,Dt;
	int minD;
	for(i=0;i<t;i++)
	{
		scanf("%d%d%d",&Ds,&Dt,&D);
		minD=D-(Ds+Dt);
		if(minD>=0)
		minD=D-(Ds+Dt);
		else if((Ds-(D+Dt))>0)
		minD=Ds-D-Dt;
		else if((Dt-(D+Ds))>0)
		minD=Dt-Ds-D;
		else minD=0;
		printf("%d\n",minD);
	}
	return 0;
}