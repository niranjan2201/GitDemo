public class Algorithms {

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //timeComplexcity is O(n)^2
    public static void BubbleSort(int arr[]){
        for (int turn=0; turn<arr.length; turn++){
            for(int j =0; j<arr.length -1-turn ; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
    }

//TimeComplexity is O(n)^2
    public static void SelectionSort(int arr[]){
        for (int i=0; i<arr.length -1 ; i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos =j;
                }
            }
            //swap
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
        }
    }

    public static void InsertionSort(int arr[]){
        for (int i=1; i<arr.length ; i++){
            int curr= arr[i];
            int prev = i-1;

            while (prev>=0 && arr[prev] > curr) {
                arr[prev +1] = arr[prev];
                prev --;
            }
            arr[prev +1] = curr;
        }
    }

    public static void CountSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            largest= Math.max(largest, arr[i]);
        }

        int Count[] = new int[largest +1];
        for(int i=0; i<arr.length; i++){
            Count [arr[i]] ++;
        }

        int j=0;
        for(int i=0; i<Count.length;i++){
            while (Count[i] > 0) {
                arr[j] =i;
                j++;
                Count[i] --;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        // BubbleSort(arr);
        // SelectionSort(arr);
        // InsertionSort(arr);
        // CountSort(arr);
        printArray(arr);   ///
        

        
    }
}
