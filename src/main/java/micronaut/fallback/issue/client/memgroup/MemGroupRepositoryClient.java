package micronaut.fallback.issue.client.memgroup;

import io.micronaut.cache.annotation.CacheConfig;
import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;

import java.util.Map;

@Client("${client.memgroup.repository.url}")
@Retryable(attempts = "1")
@CacheConfig("memgroup")
public interface MemGroupRepositoryClient {

    @Cacheable
    @Get("/memgroups/{memGroupID}")
    Map<String, String> getMemGroupFlattened(@Parameter long memGroupID);
}
