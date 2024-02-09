public class Counter {

    private int count;

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;

    }

    public void decrement() {
        if (getCount() < 0) {
            System.out.println("Invalid number");
        } else {
            count--;
        }


    }

    public void reset() {
        count = getCount() - count;
        System.out.println(count);
    }


}
