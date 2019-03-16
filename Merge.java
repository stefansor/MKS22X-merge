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
      while(yep < ans.length){
         if(i >= data1.length ){
          ans[yep] = data2[j];
          j++;
        }
        else if(j >= data2.length ){
          ans[yep] = data1[i];
          i++;
          System.out.println("yes");

        }
        else if(data1[i] < data2[j]){
          ans[yep] = data1[i];
          i++;
        }
        else if(data1[i] >= data2[j]){
          ans[yep] = data2[j];
          System.out.println("no");
          j++;
        }
        System.out.println(i);
        System.out.println(j);
        System.out.println(yep);
        System.out.println(Arrays.toString(ans));

        yep++;
      }
      return ans;
    }









    public static void main(String[] args){
      int[] one = new int[]{
        4,8,10
      };
      int[] two = new int[]{
        1,3,9,11
      };
      System.out.println(Arrays.toString(one));
      System.out.println(Arrays.toString(two));

      System.out.println(Arrays.toString(merge(one, two)));
    }














}
