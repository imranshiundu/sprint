package sprint;

import java.util.List;
import java.util.stream.Collectors;

public class EmailDomainExtractor {
    public List<String> extractDomains(List<String> emails) {
            return emails.stream()
                            .filter(e -> e.contains("@"))
                            .filter(e -> e.indexOf('@') == e.lastIndexOf('@'))
                            .filter(e -> e.indexOf('@') > 0 && e.indexOf('@') < e.length() - 1)
                            .map(e -> e.substring(e.indexOf('@') + 1).toLowerCase())
                            .distinct()
                            .collect(Collectors.toList());
                }
}