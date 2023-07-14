public class ArrayRotation {
    public static void rotateArray(int[] arr, int rotationCount) {
        rotationCount = rotationCount % arr.length;
        
        
        int[] temp = new int[rotationCount];
        
       
        System.arraycopy(arr, arr.length - rotationCount, temp, 0, rotationCount);
        
        
        System.arraycopy(arr, 0, arr, rotationCount, arr.length - rotationCount);
        
       
        System.arraycopy(temp, 0, arr, 0, rotationCount);
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotationCount = 2;
        
        rotateArray(arr, rotationCount);
        
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
