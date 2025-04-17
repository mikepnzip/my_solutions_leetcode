int addDigits(int num) {
    int a=0,b=0;

    while(num>=10)
    {
        a=num%10;
        b=num/10;
        num=a+b;
    }
    return num;
}
