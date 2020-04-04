package micronaut.fallback.issue.client.memgroup;

import io.micronaut.retry.annotation.Fallback;

import java.util.HashMap;
import java.util.Map;

@Fallback
public class MemGroupRepositoryFallback implements MemGroupRepositoryClient {

    @Override
    public Map<String, String> getMemGroupFlattened(long memGroupID) {
        return new HashMap<>();
    }
}
