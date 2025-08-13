package sprint;


public class ArrayAdder {
    public static int[] concatArrays(int[] arr1, int[] arr2) {
            int[] result = new int[arr1.length + arr2.length];
                    for (int i = 0; i < arr1.length; i++) {
                                result[i] = arr1[i];
                                        }
                                                for (int i = 0; i < arr2.length; i++) {
                                                            result[arr1.length + i] = arr2[i];
                                                                    }
                                                                            return result;
                                                                                }
                                                                                }