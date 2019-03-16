import java.util.Arrays;


public class Merge{

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    msh(data, 0, data.length - 1);
  }

  public static void msh(int[] data, int lo, int hi){
    int middle = (lo + hi) / 2;
    if(lo >= hi){
      return;
    }
    int[] left = new int[middle];
    int[] right = new int[hi - middle];
    int yep = 0;
    for(int i = lo; i < middle + 1; i++){
      left[i] = data[yep];
      yep++;
    }
    for(int j = 0; j <= hi; j++){
      right[j] = data[yep];
      yep++;
    }
    System.out.println(Arrays.toString(left));
    System.out.println(Arrays.toString(right));
    msh(left, 0, left.length - 1);
    msh(right, 0, right.length - 1);
    merge(left, right);
  }






    ///private methods must add msh that will tkae lo and hi and separate in half

  private static int[] merge(int[] data1, int[] data2){      int i = 0;
    int j = 0;
    int yep = 0;
    int [] ans = new int[data1.length + data2.length];
    while(yep < ans.length){
       if(i >= data1.length ){
        ans[yep] = data2[j];
        j++;
      }
      else if(j >= data2.length ){
        ans[yep] = data1[i];
        i++;
      }
      else if(data1[i] < data2[j]){
        ans[yep] = data1[i];
        i++;
      }
      else if(data1[i] >= data2[j]){
        ans[yep] = data2[j];
        j++;
      }
      yep++;
    }
    return ans;
  }









    public static void main(String[] args){
      int[] one = new int[]{
        4,8,10,4,5,7,3,8,9,2,8,0,4,2,54,67
      };
      System.out.println(Arrays.toString(one));
      mergesort(one);
      System.out.println(Arrays.toString(one));
    }














}
