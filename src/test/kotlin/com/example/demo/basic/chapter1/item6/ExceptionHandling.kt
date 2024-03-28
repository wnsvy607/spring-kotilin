package com.example.demo.basic.chapter1.item6

import java.io.IOException
import java.lang.Exception

// try catch finally 구문은 자바와 거의 동일하지만 이 부분도 if나 when 과 마찬가지로 식(값으로 취급 가능한 문장)으로 취급
fun parse(numberStr: String) = try {
    Integer.parseInt(numberStr)
} catch (e: Exception) {
    throw IOException("일부러 발생시키는 checked exception")
} finally {
    println("무조건 실행되는 코드블록")
}

// Java와의 차이점?
// checked Exception 이라고 해도 함수 시그니처에 throws IOException 을 붙이지 않아도 됨


/**
 * Kotlin + Spring에서 @Transactional 을 활용할 때 주의사항
 * - CheckedException은 롤백이 되지 않음!!
 *
 * 자바의 경우는
 * - 컴파일러가 알려주기 때문에 문제가 되지 않는다.
 * - CheckedException 처리를 강제하기 때문이다.
 *
 * 코틀린의 경우
 * - 컴파일러가 알려주지 않기 때문에 문제를 모르고 넘어갈 수 있음
 * - 예외가 나왔지만 롤백되지 않고 진행되는 경우가 발생 가능
 * - 해당 예외가 발생할만한 포인트는 try catch를 걸어주는 편이 좋을 수 있음
 * - 최신 라이브러리를 쓰는 것을 권장한다.
 */

fun main() {
    try {
        Integer.parseInt("123")
    } catch (e: Exception) {
        // Checked Exception 이 처리되지 않아도 컴파일에러가 발생하지 않음
        throw IOException("Checked Exception")
    } finally {
        println("무조건 실행")
    }
}




