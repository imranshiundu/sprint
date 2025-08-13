package sprint;

public class AreaCalculator {

    public static double calculateArea(double side) {
            return roundToTwoDecimalPlaces(side * side);
                }

                    public static double calculateArea(double length, double width) {
                            return roundToTwoDecimalPlaces(length * width);
                                }

                                    public static double calculateArea(double radius, boolean allowCalculation) {
                                            if (!allowCalculation) {
                                                        return Double.NaN;
                                                                }
                                                                        return roundToTwoDecimalPlaces(Math.PI * radius * radius);
                                                                            }

                                                                                private static double roundToTwoDecimalPlaces(double value) {
                                                                                        return Math.round(value * 100.0) / 100.0;
                                                                                            }
                                                                                            }