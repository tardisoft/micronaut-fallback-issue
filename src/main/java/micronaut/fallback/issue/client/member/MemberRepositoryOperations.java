package micronaut.fallback.issue.client.member;

import io.micronaut.context.annotation.Parameter;
import io.micronaut.http.annotation.Get;

import java.util.Map;

public interface MemberRepositoryOperations {
    @Get("/members/{memberID}")
    Map<String, Object> getMemberFlattened(@Parameter long memberID);
}
