/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
inline int scan()
{
        int noRead=0;
        char p=getchar_unlocked();
        for(; p<33;) {
                p=getchar_unlocked();
        };
        while(p>32) {
                noRead = (noRead << 3) + (noRead << 1) + (p - '0');
                p=getchar_unlocked();
        }
        return noRead;
};
typedef struct node{
	int score;
	int index;
	struct node *parent;
}NODE;
int getIndex(NODE *node)
{
	NODE *temp;
	temp=node;
	int index=node->index;
	while(node->parent!=NULL)
	{
		//printf("------hello--------\n");
		node=node->parent;
		index=node->index;
		temp->parent=node;
	}
	return index;
}
int main()
{
	int tc,i,j,k;
	tc=scan();
	//scanf("%d",&tc);
	NODE nodes[10009];
	int s[10009];
	while(tc--)
	{
		int n;
		n=scan();
		//scanf("%d",&n);
		for(i=1;i<=n;i++)
		{
			nodes[i].score=scan();
			//scanf("%d",&nodes[i].score);
			nodes[i].index=i;
			nodes[i].parent=NULL;
		}
		int q;
		q=scan();
		//scanf("%d",&q);
		for(i=0;i<q;i++)
		{
			int tag,x,y;
			tag=scan();
			//scanf("%d",&tag);
			if(tag==0)
			{
				x=scan();
				y=scan();
				//scanf("%d%d",&x,&y);
				int indexX=getIndex(&nodes[x]);
				int indexY=getIndex(&nodes[y]);
				NODE nodeX=nodes[indexX];
				NODE nodeY=nodes[indexY];
				if(indexX==indexY)
				{
					printf("Invalid query!\n");
				}
				else if(nodeX.score > nodeY.score)
				{
					nodes[indexY].parent=&nodes[indexX];
				}
				else if(nodeX.score < nodeY.score)
				{
					nodes[indexX].parent=&nodes[indexY];
				}
			}
			else if(tag==1)
			{
				x=scan();
				//scanf("%d",&x);
				printf("%d\n",getIndex(&nodes[x]));
			}
		}
	}
	return 0;
}
