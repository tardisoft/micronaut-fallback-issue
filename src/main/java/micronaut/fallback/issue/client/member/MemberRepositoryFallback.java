package micronaut.fallback.issue.client.member;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.retry.annotation.Fallback;

import java.util.HashMap;
import java.util.Map;

@Fallback
public class MemberRepositoryFallback implements MemberRepositoryOperations {

    @Override
    public Map<String, Object> getMemberFlattened(@Parameter long memberID) {
        return new HashMap<>();
    }
}
