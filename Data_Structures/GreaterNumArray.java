package Data_Structures;

public class GreaterNumArray {

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};  
        int n = arr.length;

        int[] nge = new int[n];

        StackClass s = new StackClass();
        s.create_stack(n);

        for (int i = 0; i < n; i++) {
            nge[i] = -1;
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= arr[i]) {
                s.pop();
            }

            if (!s.isEmpty()) {
                nge[i] = s.peek();
            }

            s.push(arr[i]);
        }

        System.out.print("Next Greater Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nge[i] + " ");
        }
    }
}
