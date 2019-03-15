import java.util.Arrays;


public class Merge{

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){}








    ///private methods must add msh that will tkae lo and hi and separate in half

    private static int[] merge(int[] data1, int[] data2){
      int i = 0;
      int j = 0;
      int yep = 0;
      int [] ans = new int[data1.length + data2.length];
      while(i < data1.length || j < data2.length){
        if()
        else if(i == data1.length - 1){
          ans[yep] = data2[j];
          j++;
        }
        else if(j == data2.length - 1){
          ans[yep] = data1[i];
          i++;
        }
        else if(data1[i] > data2[j]){
          ans[yep] = data1[i];
          i++;
        }
        else if(data1[i] < data2[j]){
          ans[yep] = data2[j];
          j++;
        }
        else if(data1[i] == data2[j]){
          ans[yep] = data1[i];
          yep++;
          ans[yep] = data2[j];
          i++;
          j++;
        }
        yep++;
      }
      return ans;
    }









    public static void main(String[] args){
      int[] one = new int[]{
        2,4,5
      };
      int[] two = new int[]{
        7,4,5
      };
      System.out.println(Arrays.toString(merge(one, two)));
    }














}
