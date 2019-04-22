class ExamRoom {
    int N;
    TreeSet<Integer> students;

    public ExamRoom(int N) {
        this.N = N;
        students = new TreeSet();
    }

    public int seat() {
        int student = 0;//这个用来记录学生坐下位置的索引
        if (students.size() > 0) {
            int dist = students.first();//返回第一个值，因为不为空，所以不会是null
            Integer prev = null;
            for (Integer s: students) {//遍历整个set，如果有值，那么记录位置，然后取中间，每次加上中间去前面的距离
                if (prev != null) {
                    int d = (s - prev) / 2;//找到中间的位置
                    if (d > dist) {
                        dist = d;//那么中间的位置就是每次要加的距离，相当于模块移动
                        student = prev + d;
                    }
                }
                prev = s;
            }
            if (N - 1 - students.last() > dist)//如果加上距离超过了最后的位置，那么就放最后的位置
                student = N - 1;
        }
        students.add(student);//让学生坐下
        return student;
    }

    public void leave(int p) {
        students.remove(p);
    }
}

/**
 * Your ExamRoom object will be instantiated and called as such:
 * ExamRoom obj = new ExamRoom(N);
 * int param_1 = obj.seat();
 * obj.leave(p);
 */

/*
 时间复杂度O(P)
 空间复杂度O(P)
*/ 
