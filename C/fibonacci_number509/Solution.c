int fib(int n){
    unsigned long long int a=1,b=1,c=0;
    if(n==0)
        return 0;
    if(n==1)
        return 1;
    if(n==2)
        return 1;
    for(int i=0; i<n-2;i++)
    {
        c=a+b;
        a=b;
        b=c;
    }
    return c;
}
