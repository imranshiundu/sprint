import java.util.LinkedHashMap;
import java.util.Map;

public class WeatherStation {
    private static final Map<Integer, String> ID_TO_KEY = new LinkedHashMap<>();
    static {
       
        ID_TO_KEY.put(1, "airTemp");
        ID_TO_KEY.put(2, "airPressure");
        ID_TO_KEY.put(7, "precipitation");
        ID_TO_KEY.put(11, "windSpeed");
        ID_TO_KEY.put(12, "windDirection");
        ID_TO_KEY.put(13, "humidity");
        ID_TO_KEY.put(14, "dewPoint");
        ID_TO_KEY.put(15, "soilMoisture");
        ID_TO_KEY.put(22, "cloudCover");
    }
    
    private final Map<String, String> state;

    public WeatherStation() {
        state = new LinkedHashMap<>();
        
        for (Map.Entry<Integer, String> entry : ID_TO_KEY.entrySet()) {
            state.put(entry.getValue(), "NULL");
        }
    }

    public void updateState(String message) {
        String[] lines = message.split("\n");
        for (String line : lines) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            if (ID_TO_KEY.containsKey(id)) {
                String value = parts[1];
                state.put(ID_TO_KEY.get(id), value);
            }
            
        }
    }

    public String getState() {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
       
        for (Map.Entry<Integer, String> idEntry : ID_TO_KEY.entrySet()) {
            if (!first) {
                sb.append("\n");
            }
            String key = idEntry.getValue();
            sb.append(key).append(":").append(state.get(key));
            first = false;
        }
        return sb.toString();
    }

    public void clearState() {
        for (String key : state.keySet()) {
            state.put(key, "NULL");
        }
    }

   
    public static void main(String[] args) {
        // Test 1: Initial state
        WeatherStation ws = new WeatherStation();
        System.out.println("Initial state:");
        System.out.println(ws.getState());
        System.out.println();

        // Test 2: Update windSpeed and humidity
        ws.updateState("11,15.5");
        ws.updateState("13,32.3");
        System.out.println("After updating windSpeed and humidity:");
        System.out.println(ws.getState());
        System.out.println();

        // Test 3: Batch update
        ws.updateState("11,15.7\n13,33.1");
        System.out.println("After batch update:");
        System.out.println(ws.getState());
        System.out.println();

        // Test 4: Clear state
        ws.clearState();
        System.out.println("After clearing state:");
        System.out.println(ws.getState());
    }
}