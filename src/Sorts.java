public class Sorts {

    public void bubbleSort(int a[]){
        for (int i=0 ; i <a.length-1 ; i++){
            for (int j = 0 ; j <a.length-i-1 ; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }



    public void SelectionSort(int a[]){
        for (int i = 0; i < a.length-1; i++){
            int min = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            if(min != i){
                swap(a,i,min);
            }
        }
    }
    public void swap(int []array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }









}
