package sprint;

import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {

    // Public method to find all primes up to the given limit
        public static List<Integer> findPrimesUpTo(int limit) {
                List<Integer> primes = new ArrayList<>();

                        if (limit < 2) {
                                    return primes;
                                            }

                                                    boolean[] isPrime = new boolean[limit + 1];
                                                            for (int i = 2; i <= limit; i++) {
                                                                        isPrime[i] = true;
                                                                                }

                                                                                        for (int i = 2; i * i <= limit; i++) {
                                                                                                    if (isPrime[i]) {
                                                                                                                    for (int j = i * i; j <= limit; j += i) {
                                                                                                                                        isPrime[j] = false;
                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                            }

                                                                                                                                                                                    for (int i = 2; i <= limit; i++) {
                                                                                                                                                                                                if (isPrime[i]) {
                                                                                                                                                                                                                primes.add(i);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                            return primes;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                }