class MedianFinder {

  PriorityQueue<Integer> max = new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer> min = new PriorityQueue<>();
    public MedianFinder() {
        
    }

    public void addNum(int num) {

        max.offer(num);

        min.offer(max.poll());

        if (min.size() > max.size()) {
            max.offer(min.poll());
        }
    }

    public double findMedian() {

        if (max.size() == min.size()) {
            return (max.peek() + min.peek()) / 2.0;
        }

        return max.peek();
    }
}