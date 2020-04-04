package micronaut.fallback.issue.client.nocache;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;

import java.util.Map;

@Client("${client.memgroup.repository.url}")
@Retryable(attempts = "1")
public interface MemGroupRepositoryNoCacheClient {

    @Get("/memgroups/{memGroupID}")
    Map<String, String> getMemGroupFlattened(@Parameter long memGroupID);
}
