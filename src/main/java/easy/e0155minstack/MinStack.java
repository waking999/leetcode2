package easy.e0155minstack;

public class MinStack {
    private int[] values;
    private int[] mins;
    private int pointer;
    private final static int LEN=10000;


    public MinStack() {
        values = new int[LEN];
        mins = new int[LEN];
        pointer = 0;
    }

    public void push(int x) {
        values[pointer] = x;
        if(pointer==0){
            mins[pointer]=x;
        }else{
            mins[pointer]=Math.min(x,mins[pointer-1]);
        }

        pointer++;
    }

    public void pop() {
        pointer--;

    }

    public int top() {
        return values[pointer-1];
    }

    public int getMin() {

        return mins[pointer-1];
    }

}
