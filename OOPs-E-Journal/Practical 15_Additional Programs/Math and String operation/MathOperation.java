package mathoperation;


public class MathOperation {

	public static void main(String[] args) {
        // 1. Absolute value
        double absoluteValue = Math.abs(-5.5);
        System.out.println("Absolute Value: " + absoluteValue);

        // 2. Power
        double powerResult = Math.pow(2, 3);
        System.out.println("Power Result: " + powerResult);

        // 3. Square root
        double sqrtResult = Math.sqrt(25);
        System.out.println("Square Root: " + sqrtResult);

        // 4. Trigonometric functions (sine)
        double sineValue = Math.sin(Math.toRadians(30));
        System.out.println("Sine Value: " + sineValue);

        // 5. Trigonometric functions (cosine)
        double cosineValue = Math.cos(Math.toRadians(60));
        System.out.println("Cosine Value: " + cosineValue);

        // 6. Minimum
        double minResult = Math.min(10, 5);
        System.out.println("Minimum Value: " + minResult);

        // 7. Maximum
        double maxResult = Math.max(10, 5);
        System.out.println("Maximum Value: " + maxResult);

        // 8. Logarithm
        double logResult = Math.log(2.71828);
        System.out.println("Natural Logarithm: " + logResult);

        // 9. Exponential function
        double expResult = Math.exp(2);
        System.out.println("Exponential Value: " + expResult);

        // 10. Rounding up
        double ceilResult = Math.ceil(4.3);
        System.out.println("Ceil Value: " + ceilResult);

        // 11. Rounding down
        double floorResult = Math.floor(4.8);
        System.out.println("Floor Value: " + floorResult);

        // 12. Rounding to the nearest integer
        double roundResult = Math.round(6.7);
        System.out.println("Rounded Value: " + roundResult);

        // 13. Random number between 0.0 and 1.0
        double randomValue = Math.random();
        System.out.println("Random Value: " + randomValue);

        // 14. Arc tangent
        double atanResult = Math.atan(1);
        System.out.println("Arc Tangent Value: " + atanResult);

        // 15. Degrees to radians conversion
        double radians = Math.toRadians(90);
        System.out.println("Radians: " + radians);

        // 16. Radians to degrees conversion
        double degrees = Math.toDegrees(Math.PI);
        System.out.println("Degrees: " + degrees);

        // 17. Hypotenuse (Pythagorean theorem)
        double hypotenuse = Math.hypot(3, 4);
        System.out.println("Hypotenuse: " + hypotenuse);

        // 18. Signum function
        double signumResult = Math.signum(-3.14);
        System.out.println("Signum Value: " + signumResult);

        // 19. Arc sine
        double asinResult = Math.asin(0.5);
        System.out.println("Arc Sine Value: " + asinResult);

        // 20. Arc cosine
        double acosResult = Math.acos(0.5);
        System.out.println("Arc Cosine Value: " + acosResult);
    }


}
