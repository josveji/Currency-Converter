import java.util.HashMap;

public record Currency(
                        String base_code,
                        HashMap<String, Double> conversion_rates
                        ) {
}
