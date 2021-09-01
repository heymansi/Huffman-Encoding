import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HuffmanEncoding
{
    void getCode(MinHeapNode root, String str, ArrayList<String> res)
    {
        if(root == null)
            return;

        if(root.data != '$')
        {
            res.add(str);
        }

        getCode(root.left,str+"0",res);
        getCode(root.right,str+'1',res);
    }

    ArrayList<String> huffmanCodes(String str,int[] freq,int N)
    {
        MinHeapNode left;
        MinHeapNode right;
        MinHeapNode top;
        ArrayList<String> res = new ArrayList<>();
        PriorityQueue<MinHeapNode> minHeap = new PriorityQueue<>(new Comparator<MinHeapNode>() {
            @Override
            public int compare(MinHeapNode o1, MinHeapNode o2) {
                if(o1.freq>= o2.freq)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        });

        //to add character in heap and its frequency
        for(int i = 0 ; i<N;i++)
        {
            minHeap.add(new MinHeapNode(str.charAt(i),freq[i]));
        }

        while (minHeap.size()!=1)
        {
            left = minHeap.poll();
            right = minHeap.poll();

            top = new MinHeapNode('$', left.freq + right.freq);
            top.left = left;
            top.right = right;

            minHeap.add(top);
        }
        getCode(minHeap.poll(),"",res);
        return res;
    }


}