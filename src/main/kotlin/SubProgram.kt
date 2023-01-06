fun main(args: Array<String>) {
  // 메인함수
  
  // 정적 배열 선언 및 초기화
  var arrayTest = IntArray(10) // 10의 크기 (size) 를 가진 배열 변수 초기화
  // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}
  arrayTest[0] = 40
  arrayTest[1] = 10
  arrayTest[2] = 9
  
  // 배열의 사이즈 (공간) 체크
  println(arrayTest.size)
  
  println(arrayTest[0]) // 첫번째 인덱스의 데이터 출력
  println(arrayTest[2])
  
 
  // 동적 배열 (컬렉션 - 리스트)
  var dynamicArrayTest = arrayListOf<String>()
  
  // 배열의 사이즈 (공간) 체크
  println(dynamicArrayTest.size)
  
  // 배열에 데이터 추가 하는 방법!
  dynamicArrayTest.add("정한솔")
  dynamicArrayTest.add("입니다.")
  
  println(dynamicArrayTest[0])
  println(dynamicArrayTest[1])
  
  // 배열의 사이즈 (공간) 체크
  println(dynamicArrayTest.size)
  
  // 배열에 데이터 삭제하는 방법!
  dynamicArrayTest.removeAt(0)
  
  // 남은 데이터는 "입니다." 밖에 안남은 .. 즉, 방 역시 1칸 남아버림!
  
  println(dynamicArrayTest[0])
  
  // 배열의 수정 하는 방법
  dynamicArrayTest.set(0, "아니다.")
  
  println(dynamicArrayTest[0])
}