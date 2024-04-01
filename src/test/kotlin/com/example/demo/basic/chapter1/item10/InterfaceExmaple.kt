package com.example.demo.basic.chapter1.item10

interface ExampleError


class FileError(val fileName: String) : ExampleError
class DatabaseError(val dbmsType: DbmsType) : ExampleError
class NetworkError(val code: String) : ExampleError


// else 문이 강제되고 (안하면 컴파일 에러 발생) 새로운 요소 추가시 개발자가
// 변경해야할 포인트를 찾기 어렵다
fun getErrorMessage(error: ExampleError) = when (error) {
    is FileError -> "Error is occurred at ${error.fileName}"
    is DatabaseError -> "Error on DBMS ${error.dbmsType}"
    else -> throw IllegalArgumentException("Unknown type")
}
