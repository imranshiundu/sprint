package sprint;


public class StringConcatenator {

    public String concatenate(String... strings) {
            StringBuilder sb = new StringBuilder();
        for (String str : strings) {
           sb.append(str);
}
        return sb.toString();
}
}