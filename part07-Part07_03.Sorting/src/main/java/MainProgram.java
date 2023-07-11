
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array){
        // write your code here
        int sml=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < sml){
                sml=array[i];
            }
        }
        return sml;
    }

    public static int smallest(int[] array, int startIndex){
        // write your code here
        int sml=array[startIndex];
        for (int i = startIndex; i < array.length; i++) {
            if(array[i] < sml){
                sml=array[i];
            }
        }
        return sml;
    }

    public static int indexOfSmallest(int[] array){
        // write your code here
        int index = -1;
        int sml = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==sml){
                index=i;        
                return index;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex){
        // write your code here
        int index = -1;
        int sml = smallest(array, startIndex);
        for (int i = startIndex; i < array.length; i++) {
            if(array[i]==sml){
                index=i;        
                return index;
            }
        }
        return index;
    }

    public static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
    
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int sml = indexOfSmallestFrom(array,i);
            if(i==sml){
                continue;
            }
            swap(array, i, sml);
        }
    }
    

}
