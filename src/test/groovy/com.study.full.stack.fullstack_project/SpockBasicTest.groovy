import com.study.full.stack.fullstack_project.dto.User
import com.study.full.stack.fullstack_project.service.UserService
import spock.lang.Specification

// https://yangbongsoo.gitbooks.io/study/content/junit+mockito_vs_groovy+spock.html
class SpockBasicTest extends Specification {

    // given, when, then 간단한 예제
    def "첫번째 값을 리턴 합니다."() {
        given:
        List<Integer> list = new ArrayList()
        when:
        list.add(1)
        then:
        2 == list.get(0)

    }

    // BDD기반의 간단한 테스트 : expect
    def "NameInverter"() {
        expect:
        invert(null) == null
    }

    private String invert(String name) {
        return null
    }

    def "creating example  stubs"() {
        given:
            List list = Stub(List)
            List list2 = Stub()
            def list3 = Stub(List)
    }

    def "stub 사용법"() {
        given:
        List list = Stub()
        list.size() >> 3
        expect:
        list.size() == 3
    }

    def "유저이름이 Norman이면, exception, 유저이름이 R이면 정상처리"() {
        given:
        UserService userService = Stub()
        userService.save({ User user -> 'Norman' == user.name}) >> {
            throw new IllegalArgumentException("We don't want you here, Norman!")
        }

        when:
        User user = new User(name: 'Norman')
        userService.save(user)
        then:
        thrown(IllegalArgumentException)

        when:
        User user2 = new User(name: 'R')
        userService.save(user2)
        then:
        notThrown(IllegalArgumentException)
    }

    def "만약 리스트에 Integer 추가하 예외처리 " () {
        given:
        List list = Stub()
        list.add(_ as Integer) >> {throw new IllegalArgumentException()}

        when:
        list.add(2)
        then:
        1 == list.get(0)
        thrown(IllegalArgumentException)

        when:
        list.add("String")
        then:
        notThrown(IllegalArgumentException)
    }

}