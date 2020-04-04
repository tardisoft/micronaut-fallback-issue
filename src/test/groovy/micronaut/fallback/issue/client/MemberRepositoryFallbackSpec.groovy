package micronaut.fallback.issue.client

import io.micronaut.context.annotation.Property
import io.micronaut.test.annotation.MicronautTest
import micronaut.fallback.issue.client.member.MemberRepositoryClient
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
@Property(name = "client.member.repository.url", value = "http://localhost:8888")
class MemberRepositoryFallbackSpec extends Specification {

    @Inject
    MemberRepositoryClient client

    def "happy path - fallback"() {
        expect:
        client.getMemberFlattened(2) == [:]
    }
}
