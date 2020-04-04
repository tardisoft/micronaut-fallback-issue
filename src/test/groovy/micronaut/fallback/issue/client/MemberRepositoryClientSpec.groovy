package micronaut.fallback.issue.client


import io.micronaut.test.annotation.MicronautTest
import micronaut.fallback.issue.client.member.MemberRepositoryClient
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MemberRepositoryClientSpec extends Specification {

    @Inject
    MemberRepositoryClient client

    def "happy path"() {
        expect:
        client.getMemberFlattened(12) == ["hello": "world 12"]
    }
}
