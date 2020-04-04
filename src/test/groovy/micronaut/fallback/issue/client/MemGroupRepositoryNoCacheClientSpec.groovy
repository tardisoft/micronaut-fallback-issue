package micronaut.fallback.issue.client

import io.micronaut.test.annotation.MicronautTest
import micronaut.fallback.issue.client.nocache.MemGroupRepositoryNoCacheClient
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MemGroupRepositoryNoCacheClientSpec extends Specification {

    @Inject
    MemGroupRepositoryNoCacheClient client

    def "happy path - no fallback"() {
        expect:
        client.getMemGroupFlattened(13) == ["hello": "world 13"]
    }
}
