fun main(args: Array<String>) {
  // 프로그램이 첫 시작되는 수행 지점. (메인 함수)
  println("Hello 정한솔")

  //변수
  // 1. 변할 수 있는 수(값)
  // 2. 값을 저장해 놓는 공간
  var a = 1 //1+1=2 의 '=' 의 표현과는 다르게 이해해야 함
  println(a)
  
  var a2 ="정한솔"
  println(a2)
  
  // 변수명을 지을땐 관련된 의미를 부여하는 것이 좋음
  var fruitName = "사과"
  
  // 선언 (값이 할당되기 전에 타입 지정을 하고 변수를 선언하는 과정)
  var a3 : String // String 문자열은 타입
  
  // 초기화 (값을 최초로 할당을 함)
  a3 = "블라블라"
  
  // var = 값이 언제든지 바뀌어도됌 val = 안됌
  val abc = 350
  println(abc)
  
  var b : String
  var b2 : Int
  var b3 : Boolean = false// True or False
  var b4 : Float = 0.112312F // 실수 (소수) 접미어로 F가 붙어야함.
  println(b4)
}