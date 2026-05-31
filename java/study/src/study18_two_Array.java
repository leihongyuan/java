public class study18_two_Array {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {6,6,6,6},
                {2,2,3,4}
        };
        for(int i=0;i<arr.length;i++){//遍历每一行-->遍历外层的数组
            for(int j=0;j<arr[i].length;j++){//遍历每一列--->遍历内层的数组
                System.out.println(arr[i][j]+"l ");//定位到具体的一个
            }
            System.out.println();//每执行一行数组，换行
        }
    }
}
