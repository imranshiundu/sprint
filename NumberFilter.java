package sprint;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class NumberFilter {
    private List<Integer> numbers;

    public NumberFilter(int count, long seed) {
        this.numbers = generateRandomNumbers(count, seed);
    }

    private List<Integer> generateRandomNumbers(int count, long seed) {
        List<Integer> result = new ArrayList<>();
        Random rand = new Random(seed);
        for (int i = 0; i < count; i++) {
            result.add(rand.nextInt(2001) - 1000);
        }
        return result;
    }

    public List<Integer> getAllPrimeNumbers() {
        List<Integer> primes = new ArrayList<>();
        for (int n : numbers) {
            if (isPrime(n)) primes.add(n);
        }
        return primes;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public List<Integer> getDivisibleBy3ButNot5() {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % 3 == 0 && n % 5 != 0) result.add(n);
        }
        return result;
    }

    public List<Integer> getSortedRemainingNumbers() {
        List<Integer> result = new ArrayList<>();
        for (int n : numbers) {
            if (n % 3 != 0 && n % 5 != 0) result.add(n);
        }
        result.sort((a, b) -> b - a);
        return result;
    }

    public double computeAverageOfRemainingNumbers() {
        List<Integer> remaining = getSortedRemainingNumbers();
        if (remaining.isEmpty()) return 0;
        double sum = 0;
        for (int n : remaining) sum += n;
        return sum / remaining.size();
    }
}
