package day12_array;

public class sortedElement {
    public static void main(String[] args) {

        //original array
        int [] arr = { 10, 10, 10, 20, 20, 30, 40, 50, 60, 70 };

        //create another array of similar size
        int [] temp = new int[arr.length];
        int count = 0;

        //traverse original array
        for (int i = 1; i < arr.length; i++){

            // current element
            int element = arr[i];

            //if already exist then don't check
            if(element == temp[count]){
                continue;
            }

            //check occurrence of element
            for (int j = i + 1; j<arr.length; j++){
                if (arr[j] == element){
                    temp[count++] = element;
                    //found, therefore break
                    break;
                }
            }
        }

        //display total repeated elements
        System.out.println("Total Repeated Elements: "+ count);

        //display repeated elements
        System.out.println("Repeated Elements Are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(temp[i] + " ");
        }
    }
}
