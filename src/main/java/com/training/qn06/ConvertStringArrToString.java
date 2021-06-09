package main.java.com.training.qn06;

public class ConvertStringArrToString {

    // Convert String array to String String[] input1=["Vikas","Lokesh",Ashok]
    // Expected output String: "Vikas,Lokesh,Ashok"

    public static void main(String[] args) {
        String arrToStr = null;

        for (String value : args) {
            if (arrToStr == null) {
                arrToStr = value;
            } else {
                arrToStr = arrToStr.concat(",").concat(value);
            }
        }

        System.out.println("The String is: " + arrToStr);
    }
}