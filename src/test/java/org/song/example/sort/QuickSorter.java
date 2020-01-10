package org.song.example.sort;

public class QuickSorter {

	private static int Partition(long arr[], int low, int high) 
    { 
        long pivot = arr[high];  int i = (low - 1);
        
        for (int j = low; j < high; j++) 
        { 
            if (arr[j] < pivot) 
            { 
                i++; 
                long temp = arr[i];  arr[i] = arr[j];  arr[j] = temp; 
            } 
        } 
  
        int pi = i + 1;
        long temp = arr[pi];  arr[pi] = arr[high];  arr[high] = temp; 
  
        return pi; 
    }
	
	private static void QuickSort(long arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            int pi = Partition(arr, low, high); 
            QuickSort(arr, low, pi - 1); 
            QuickSort(arr, pi + 1, high); 
        } 
    }
	
	public static void Sort(long arr[]) {
		QuickSort(arr, 0, arr.length - 1);
	}
}
