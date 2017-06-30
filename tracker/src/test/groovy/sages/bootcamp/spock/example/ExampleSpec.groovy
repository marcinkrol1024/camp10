package sages.bootcamp.spock.example

import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ExampleSpec extends Specification {

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
