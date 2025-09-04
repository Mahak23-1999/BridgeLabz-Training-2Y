public class CourseFee {
    public static void main(String[] args) {
        int fee = 125000;                 // original fee
        int discountPercent = 10;         // discount percentage

        int discount = (fee * discountPercent) / 100;   // discount amount
        int discountedFee = fee - discount;             // final fee after discount

        System.out.println("The discounted amount is INR " + discount);
        System.out.println("The discounted price the student will pay is INR " + discountedFee);
    }
}
