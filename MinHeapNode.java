
public class MinHeapNode {
    char data;
    int freq ;
    MinHeapNode left;
    MinHeapNode right;

    public MinHeapNode(char data,int freq)
    {
        this.left = null;
        this.right = null;
        this.data = data;
        this.freq = freq;
    }

}
