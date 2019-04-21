double myPow(double x, int n) { 
    if(n==0) return 1;
    double t = myPow(x,n/2);//递归
    if(n%2) return n<0 ? 1/x*t*t : x*t*t;//每次除2，就平方一下
    else return t*t;
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
