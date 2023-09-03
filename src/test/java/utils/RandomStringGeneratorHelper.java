package utils;

import org.apache.commons.text.RandomStringGenerator;

public class RandomStringGeneratorHelper {
    public static String randomAlphabetic(int count) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('a', 'z').build();
        return generator.generate(count);
    }

    public static String randomNumeric(int count) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder()
                .withinRange('0', '9').build();
        return generator.generate(count);
    }
}
