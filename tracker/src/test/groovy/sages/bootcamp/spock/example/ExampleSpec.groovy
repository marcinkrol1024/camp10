package sages.bootcamp.spock.example

import org.jooq.DSLContext
import sages.bootcamp.tracker.jooq.di.PersistenceModule
import sages.bootcamp.tracker.jooq.tables.records.UsersRecord
import spock.guice.UseModules
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject
import java.util.stream.Collectors

import static sages.bootcamp.tracker.jooq.Tables.USERS

@Unroll
@UseModules(PersistenceModule.class)
class ExampleSpec extends Specification {

	@Inject
	DSLContext dslContext

	def setup() {
		dslContext.execute("delete from users;")
	}

	def "should test adding users"() {

		when:
		expectedUsers.forEach { UsersRecord user ->
			dslContext
					.insertInto(USERS, USERS.LOGIN, USERS.PASSWORD)
					.values(user.getLogin(), user.getPassword())
					.execute()
		}

		then:
		def actualUsers = dslContext
				.selectFrom(USERS)
				.fetch()
				.stream()
				.collect(Collectors.toSet())

		assertUsersEqual(actualUsers, expectedUsers)

		where:
		expectedUsers << [
				[new UsersRecord(null, "marcin", "pass1")] as Set,
				[new UsersRecord(null, "marcin", "pass1"), new UsersRecord(null, "kamil", "pass2")] as Set
		]
	}

	private void assertUsersEqual(Set<UsersRecord> actualUsers, Set<UsersRecord> expectedUsers) {
		assert actualUsers.size() == expectedUsers.size()
		assert actualUsers.every { UsersRecord actualUser ->
			expectedUsers.any { UsersRecord expectedUser ->
				actualUser.getLogin() == expectedUser.getLogin() &&
						actualUser.getPassword() == expectedUser.getPassword()
			}
		}
	}

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
