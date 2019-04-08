/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {

        if (intervals == null || intervals.size() < 1) {
            return new LinkedList<>();
        }
        
        Collections.sort(intervals, (a, b) -> a.start - b.start);//以头为目标值，然后排序

        Stack<Interval> result = new Stack<>();
        result.push(new Interval(intervals.get(0).start, intervals.get(0).end));//先把第一个加进去
				
        for (Interval current : intervals) {//遍历整个链表
            Interval observe = result.peek();//由于已经排好序了，那么就只要没次看最上层的就行
            if (current.start <= observe.end) {//如果前一个的末尾和后一个的起始点有重合，那么起始点为前一个区间的起始点，后一个为最大的末尾
                observe.end = Math.max(observe.end, current.end);//在原基础上改变就不用pop了
            } else {
                result.push(new Interval(current.start, current.end));//否则就直接加进去
            }
        }

        return result;
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(1)
*/
