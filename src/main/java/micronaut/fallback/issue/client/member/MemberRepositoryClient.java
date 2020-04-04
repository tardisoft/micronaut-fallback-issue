package micronaut.fallback.issue.client.member;

import io.micronaut.cache.annotation.CacheConfig;
import io.micronaut.cache.annotation.Cacheable;
import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.retry.annotation.Retryable;

import java.util.Map;

@Client(id = "member", path = "${client.member.repository.url}")
@Retryable(multiplier = "1", attempts = "2")
@CacheConfig("member")
public interface MemberRepositoryClient extends MemberRepositoryOperations {

    @Cacheable
    Map<String, Object> getMemberFlattened(@Parameter long memberID);
}
