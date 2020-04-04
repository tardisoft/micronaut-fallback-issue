package micronaut.fallback.issue.client.nocache;

import io.micronaut.retry.annotation.Fallback;

import java.util.HashMap;
import java.util.Map;

@Fallback
public class MemGroupRepositoryNoCacheFallback implements MemGroupRepositoryNoCacheClient {

    @Override
    public Map<String, String> getMemGroupFlattened(long memGroupID) {
        return new HashMap<>();
    }
}
