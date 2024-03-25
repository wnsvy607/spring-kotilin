package com.example.demo.basic.chapter1.item4

import java.time.Duration
import java.time.LocalDateTime


// 조건(if, when등)의 실행 부분이 {} 블록인 경우 마지막 값이 결과값으로 취급됨

fun printObject(obj: Any): Unit {
    //smart cast란? is 호출시 자동으로 타입 캐스팅을 해주는 것
    when (obj) {
        // smart cast 덕분에 String 변환되어 lowercase() 메서드 활용
        is String -> println(obj.lowercase())
        // smart cast 덕분에 Duration 변환되어 nano 프로퍼티 접근
        is Duration -> println(obj.nano)
        // smart cast 덕분에 LocalDateTime 변환되어 month 프로퍼티 접근
        is LocalDateTime -> println(obj.month)
        else -> print("Unknown type")
    }

    // 아래와 같이 명시적 형변환도 가능하다.
    // val str = obj as String
}


// if문 에서의 smart cast
fun getStr(obj: Any): String =
        if (obj is String) {
            println(obj.lowercase())
            obj.lowercase()
        } else if (obj is Duration) {
            print(obj.nano)
            obj.nano.toString()
        } else throw RuntimeException()


fun main() {
    printObject("이준표")
    printObject(Duration.ofNanos(912))
    printObject(LocalDateTime.of(2024, 3, 25, 22, 10))
    getStr("이준표")
    getStr(Duration.ofNanos(592))
}
