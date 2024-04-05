package com.example.demo.basic.chapter1.item18

import com.example.demo.basic.BasicPractice.Person

// Nullability
// 자바에서는 Null 인 객체를 잘못 사용하면 NullPointerException(NPE)가 발생
// 이것을 방지하기 위해 메서드 최상단은 항상 Null 여부 체크가 필수
// 코틀린에서는 이것을 더욱 명확히 관리

// 의문 혹은 불확실함을 나타내는 물음표(?)를 활용하여 nullable한 타입임을 나타냄
// 해당 타입의 경우 컴파일 시점부터 null check 가 진행됨
// not null type variable = nullable type variable: 컴파일 오류 발생
// nullable type variable = not null type variable: 가능
fun main() {

    // 널이 될 수 있는 타입
    val nullable: String?

    // 널이 될 수 없는 타입
    val notNull: String

// 함수 파라미터, 응답타입 등이나 클래스의 생성자나 프로퍼티 정의에도 사용 가능
// nullable한 클래스 타입의 경우 메서드 호출을 하려면..
    val nullablePerson: Person? =
        if (System.currentTimeMillis() % 2 == 0L) Person("Even", 22)
        else null

    // if 검사 등으로 특정 영역에서는 not null 타입처럼 사용 가능
    if (nullablePerson != null) {
        println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson.age}")
    }

    // ?. 호출을 수행 : 값이 있는 경우는 호출 결과, 값이 없는 경우 null
    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson?.age}")
    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson?.age ?: 0}")
    // !!. 호출을 수행 : 값이 없는 경우 NPE 발생 <- 권장하지는 않는 방식
    println("짝수 시간에만 존재하는 사람의 나이는 : ${nullablePerson!!.age}")


}

// 엘비스 연산자
// ?:을 엘비스 연산자로 부름
// nullable한 타입이 없는 경우 default value를 지정해주는 연산자
fun nullableToNotNull(s: String?): String = s ?: "default string"



// 플랫폼 타입: 자바 라이브러리 혹은 자바 코드에서 가져온 값의 null 여부를 체크할 수 없는 경우의 타입을 뜻함
    // null 관련된 표준어노테이션이나 특정 어노테이션이 있는 경우에 코틀린이 타입 인식함
        // 자바쪽에서 @NotNull, @Nullable 같은 어노테이션을 붙이면 자동으로 타입 정의 가능함
    // 플랫폼 타입은 개발자가 직접 해당 타입의 nullability를 지정해야 함
    // 자바 클래스의 값을 가져오는 경우 아래 두 가지 모두 가능함
