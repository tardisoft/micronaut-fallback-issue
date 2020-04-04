package micronaut.fallback.issue.client

import io.micronaut.context.annotation.Property
import io.micronaut.test.annotation.MicronautTest
import micronaut.fallback.issue.client.nocache.MemGroupRepositoryNoCacheClient
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
@Property(name = "client.memgroup.repository.url", value = "http://localhost:8888")
class MemGroupRepositoryNoCacheFallbackSpec extends Specification {

    @Inject
    MemGroupRepositoryNoCacheClient client

    def "happy path - fallback"() {
        expect:
        client.getMemGroupFlattened(3) == [:]
    }
}
