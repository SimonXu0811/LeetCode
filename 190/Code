public int reverseBits(int n) {
    int result = 0;
    for (int i = 0; i < 32; i++) {
        result += n & 1;
        n >>>= 1;   // 将n从右向左取处，如果是1，那么就将res左移并且加1，如果为0，就直接左移
        if (i < 31) // 一直左移31位，最后一位直接加上去就行
            result <<= 1;
    }
    return result;
}
