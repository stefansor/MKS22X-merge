import java.util.Arrays;


public class Merge{

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    msh(data, 0, data.length - 1);
  }

  public static void msh(int[] data, int lo, int hi){
    int middle = (lo + hi) / 2 + 1;
    if(lo >= hi){
      return;
    }
    int[] left = new int[middle];
    int[] right = new int[hi - middle + 1];
    int yep = 0;
    for(int i = lo; i < middle; i++){
      left[i] = data[yep];
      yep++;
    }
    for(int j = 0; j < hi - middle + 1; j++){
      right[j] = data[yep];
      yep++;
    }

    msh(left, 0, left.length - 1);
    msh(right, 0, right.length - 1);
    int[] finis = new int[data.length];
    finis = merge(left, right);
    for(int i = 0; i < data.length; i++){
      data[i] = finis[i];
    }
  }






  private static int[] merge(int[] data1, int[] data2){
    int i = 0;
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









  public static void main(String[]args){
    System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
    int[]MAX_LIST = {1000000000,500,10};
    for(int MAX : MAX_LIST){
      for(int size = 31250; size < 2000001; size*=2){
        long qtime=0;
        long btime=0;
        //average of 5 sorts.
        for(int trial = 0 ; trial <=5; trial++){
          int []data1 = new int[size];
          int []data2 = new int[size];
          for(int i = 0; i < data1.length; i++){
            data1[i] = (int)(Math.random()*MAX);
            data2[i] = data1[i];
          }
          long t1,t2;
          t1 = System.currentTimeMillis();
          Merge.mergesort(data2);
          t2 = System.currentTimeMillis();
          qtime += t2 - t1;
          t1 = System.currentTimeMillis();
          Arrays.sort(data1);
          t2 = System.currentTimeMillis();
          btime+= t2 - t1;
          if(!Arrays.equals(data1,data2)){
            System.out.println("FAIL TO SORT!");
            System.exit(0);
          }
        }
        System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
      }
      System.out.println();
    }
  }














}
