package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {




    public static void main(String[] args) {
        int n;
        int min, max;
        System.out.println("Enter array's size: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.print("Enter min and max value elements of array:\nMin=");
        min = sc.nextInt();
        System.out.print("Max=");
        max = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = (int) (Math.random() * (max - min)) + min;
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " , ");
        qs(array, 0, n - 1);
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.print(array[i] + " , ");
    }

    public static int pr(int arr[], int left, int right) {
        int tmp;
        int i = left;
        int j = right;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
    public static void qs(int arr[],int left, int right)
    {
        int index=pr(arr,left,right);
        if (left<index-1)
            qs(arr,left,index-1);
        if(right>index)
            qs(arr,index,right);
    }
}


