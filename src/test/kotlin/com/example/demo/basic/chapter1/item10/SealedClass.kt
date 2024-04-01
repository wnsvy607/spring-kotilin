package com.example.demo.basic.chapter1.item10

// sealed class 내부에 해당 클래스의 구현체를 모두 나열함
sealed class Error {
    class FileError(val fileName: String) : Error()
    class DatabaseError(val dbmsType: DbmsType) : Error()
    class NetworkError(val code: String) : Error()
}


enum class DbmsType {
    MYSQL, MARIA, ORACLE, H2
}

// when 절에서 모든 구현체를 조건에 넣으면 else 구문이 불필요하다.
// 신규 구현체 만들 때는 자동으로 컴파일 에러 발생하여 수정이 쉽다.
fun getCharacter(error: Error) = when (error) {
    is Error.FileError -> "Error is occurred at ${error.fileName}"
    is Error.DatabaseError -> "Error on DBMS ${error.dbmsType}"
    is Error.NetworkError -> "Error on Network ${error.code}"
}

fun main() {
    println(getCharacter(Error.NetworkError("200")))
}
