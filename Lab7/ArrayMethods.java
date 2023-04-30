import java.util.Arrays;

public class ArrayMethods {
    private int[] a = {7,8,8,3,4,9,8,7};
    public ArrayMethods()
    {

    }

    public int count()
    {
        return a.length;
    }
    public int sum()
    {
        int total = 0;
        for(int i=0;i<a.length;i++)
        {
            total += a[i];
        }
        return total;
    }
    public double average()
    {
        return sum()/count();
    }

    public int findMax()
    {
        int max = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }
    public int findIndexOfMax()
    {
        int max = 0;
        int index = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] > max)
            {
                max = a[i];
                index = i;
            }
        }
        return index;

    }
    public int findLast(int key)
    {
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i] == key)
            {
                return i;
            }
        }
        return -1;
    }
    public int[] findAll(int key)
    {
        int[] output = {};
        for(int i=0;i<a.length;i++)
        {
            if(a[i] == key)
            {
                output = Arrays.copyOf(output, output.length + 1);
                output[output.length - 1] = i;
            }
        }
        return output;
    }

    public int[] getArray()
    {
        return a;
    }
    public int[] copyArray()
    {
        return Arrays.copyOf(a,a.length);
    }
    public void print(int[] a)
    {
        System.out.print("{");
        int i;
        //print elements before the last, separated by commas
        for(i=0;i<a.length - 1;++i)
        {
            System.out.print(a[i] + ",");
        }
        //print last element. careful here to handle length 0
        if(a.length > 0)
        {
            System.out.print(a[i]);
        }
        System.out.print("}");
    }
    
    public void sortArray(int[] inArray)
    {
        int[] output = new int[inArray.length];
        int temp;

        for(int i=0;i<=inArray.length-1;i++)
        {
            temp = 0;
            for(int e=0;e<=inArray.length-1;e++)
            {
                if(inArray[temp] > inArray[e])
                {
                    temp = e;
                }
            }

            output[i] = inArray[temp];
            inArray[temp] = 256;
        }

        for(int i=0;i<=inArray.length-1;i++)
        {
            inArray[i]=output[i];
        }

    }
    public int[] reverseArray(int[] inArray)
    {
        int [] out = new int[inArray.length];
        for(int i=0;i<inArray.length;i++)
        {
            int l = inArray.length-i;
            l--;
            out[i] = inArray[l];
        }
        return out;
    }
    public void genFiveByFiveRows()
    {
        int[][] out = new int[5][5];
        for(int c=0;c<out.length;c++){
            for(int r=0;r<out[0].length;r++)
            {
                out[c][r] = r+1;
            }
        }

        for(int r=0;r<out[0].length+1;r++)
        {
            for(int c=0;c<out.length+1;c++)
            {
                if(c==0&&r==0){
                    System.out.print("  ");
                }else if(c==0){
                    System.out.print(r + " ");
                }else if(r==0){
                    System.out.print((char)(c+'A'-1) + " ");
                }else{
                    System.out.print(out[c-1][r-1] + " ");
                }
            }
            System.out.println();
        }
    }
    public void genFiveByFiveCols()
    {
        char[][] out = new char[5][5];;
        for(int c=0;c<out.length;c++){
            for(int r=0;r<out[0].length;r++)
            {
                out[c][r] = (char)('A'+c);
            }
        }

        for(int r=0;r<out[0].length+1;r++)
        {
            for(int c=0;c<out.length+1;c++)
            {
                if(c==0&&r==0){
                    System.out.print("  ");
                }else if(c==0){
                    System.out.print(r + " ");
                }else if(r==0){
                    System.out.print((char)(c+'A'-1) + " ");
                }else{
                    System.out.print(out[c-1][r-1] + " ");
                }
            }
            System.out.println();
        }
    }
}
