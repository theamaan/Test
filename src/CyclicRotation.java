class CyclicRotation {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};
        int rotations = 2;

        System.out.println("Original Array:");
        printArray(arr);

        rotateArrayByTwo(arr, rotations);

        System.out.println("Array after cyclically rotating by two positions:");
        printArray(arr);
    }

    public static void rotateArrayByTwo(int[] arr, int rotations) {
        int n = arr.length;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, rotations - 1);
        reverseArray(arr, rotations, n - 1);
    }

    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
