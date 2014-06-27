/*This code is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
#include <stdio.h>
#include <malloc.h>
int DISTANCE(int x,int y,int z,int a,int b,int c)
{
    int m1,m2,m3;
    if(x>a)
    m1=x-a;
    else m1=a-x;
    if(y>b)
    m2=y-b;
    else m2=b-y;
    if(z>c)
    m3=z-c;
    else m3=c-z;
    return (m1+m2+m3);
}
  
int main()
{
    int N,Q,i,j,k;
    scanf("%d",&N);
    int *X,*Y,*Z;
    X=(int*)malloc(sizeof(int)*N);
    Y=(int*)malloc(sizeof(int)*N);
    Z=(int*)malloc(sizeof(int)*N);
    for(i=0;i<N;i++)
    {
                    scanf("%d%d%d",&X[i],&Y[i],&Z[i]);
    }
    scanf("%d",&Q);
    int *A,*B,*C,*D;
    A=(int*)malloc(sizeof(int)*Q);
    B=(int*)malloc(sizeof(int)*Q);
    C=(int*)malloc(sizeof(int)*Q);
    D=(int*)malloc(sizeof(int)*Q);
    int *temp;
    temp=(int*)malloc(sizeof(int)*N);
    for(i=0;i<Q;i++)
    {
                    scanf("%d%d%d",&A[i],&B[i],&C[i]);
    }
    int mini=0,index;
    for(i=0;i<Q;i++)
    {
                    for(j=0;j<N;j++)
                    {
                                    temp[j]=DISTANCE(X[j],Y[j],Z[j],A[i],B[i],C[i]);
                    }
                    
                    printf("%d\n",index);
    }
    //scanf("%d",&i);
    return 0;
}
 