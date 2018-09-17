package com.study.full.stack.fullstack_project

import org.hibernate.Transaction
import spock.lang.Specification

class HelloTest extends Specification {

    def "다야한 제곱 테스트"() {
        expect:
        Math.pow(base, 2) == expectedResult

        where:
        base || expectedResult
        2    || 4
        3    || 9
        10   || 100
    }

    def "class로 Spy를 만들어야 된다." () {
        given:
        Transaction transaction = Stub(Transaction)
        UserService service = Spy(UserServiceImple, constructorArgs: [transaction])

        expect:
        service.save(new User(name: 'Norman'))
    }

    def "interface로 Spy 만들면 안된다."() {
        given:
        UserService service = Spy(UserService)

        expect:
        service.save(new User(name:'Norman'))
    }


    def "creating example mocks"() {
        given:
        List list = Mock(List)

        List list2 = Mock()

        def list3 = Mock(List)
    }

    def "만약 리스트에 Integer 추가하면 예외처리"() {
        given:
        List list = Stub()
        list.add(_ as Integer) >> { throw new IllegalArgumentException()}

        when:
        list.add(2)
        then:
        thrown(IllegalArgumentException)

        when:
        list.add("String")
        then:
        notThrown(IllegalArgumentException)

    }

    def "유저 일음이 Norman이  exception, 유저이름이 R이면 정상처리"() {
        given:
        UserService service = Stub()
        service.save({User user -> 'Norman' == user.name}) >> {
            throw new IllegalArgumentException("We don't want you here, Norman!")
        }

        when:
        User user = new User(name: 'Norman')
        service.save(user)
        then:
        thrown(IllegalArgumentException)

        when:
        User user2 = new User(name: 'R')
        service.save(user2)
        then:
        notThrown(IllegalArgumentException)

    }

    def "Stub사용법"() {
        given:
        List list = Stub()
        list.size() >> 3

        // 모든 인자 허용
        list.contains(_) >> true

        // 모든 Integer 인자 허용
        list.add(_ as Integer) >> true

        // null이 아니면 허용
        list.add(!null) >> true

        // someObject가 아니면 허용
        list.add(!someObject) >> true

        expect:
        list.size() == 4
    }

    def "creating example stubs"() {
        given:
        List list = Stub(List)
        List list2 = Stub()
        def list3 = Stub(List)
    }

    def "첫번째 요소에서 2를 리턴해야 함"() {
        given:
        List<Integer> list = new ArrayList<>();

        when:
        list.add(1)

        then:
        1 == list.get(0)
    }

    def "NaeInverter 테스트"() {
        expect:
        invert(null) == ""
    }

    private String invert(String name) {
        return null
    }

    def "헬로월드"(){
        setup:
        println ("헬로우 월드")
    }
}