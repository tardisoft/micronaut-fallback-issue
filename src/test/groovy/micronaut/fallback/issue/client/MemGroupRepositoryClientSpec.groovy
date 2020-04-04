package micronaut.fallback.issue.client


import io.micronaut.test.annotation.MicronautTest
import micronaut.fallback.issue.client.memgroup.MemGroupRepositoryClient
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MemGroupRepositoryClientSpec extends Specification {

    @Inject
    MemGroupRepositoryClient client

    def "happy path - no fallback"() {
        expect:
        client.getMemGroupFlattened(1) == ["hello": "world 1"]
    }
}
