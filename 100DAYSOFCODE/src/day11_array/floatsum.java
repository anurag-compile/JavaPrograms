package day11_array;

public class floatsum {
    public static void main(String[] args) {
        float [] marks = {21.2f, 32.4f, 53.3f, 65.3f, 87.7f };
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The Value of Sum is " + sum);
    }
}
