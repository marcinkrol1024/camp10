package sages.bootcamp.spock.example

import org.jooq.DSLContext
import sages.bootcamp.tracker.jooq.di.PersistenceModule
import spock.guice.UseModules
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@Unroll
@UseModules(PersistenceModule.class)
class ExampleSpec extends Specification {

	@Inject
	DSLContext dslContext

	def "should test adding left: #left and right: #right"() {
		when:
		int acutalSum = left + right

		then:
		acutalSum == expectedSum

		where:
		left | right | expectedSum
		3    | 5     | 8
		10   | 1     | 11
		0    | 0     | 0
	}

	def "should test another adding left: #left and right: #right"() {
		when:
		int acutalSum = left + right

		then:
		acutalSum == expectedSum

		where:
		left | right | expectedSum
		3    | 5     | 8
		10   | 1     | 11
		0    | 0     | 0
	}

}
