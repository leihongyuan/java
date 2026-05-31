import java.util.Arrays;

public class study17_Arrays_tool {
    public static void main(String[] args) {
        //工具一：比较数组内的大小
        int[] arr={5,2,8,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //工具二：比较数组的内容
        int[] a={1,2,3};
        int[] b={2,1,3};
        System.out.println(Arrays.equals(a,b));
    }
}
