let foo = 123;  //전역 변수
{
    let foo = 456;  //지역 변수
    let bar = 456;  //지역 변수
}

console.log(foo);   //123
console.log(bar);   //ReferenceEroor : bar is not defineds

/*
let 키워드로 선언된 변수는 블록 레벨 스코프를 따른다.
위 예제에서 코드 블록 내에 선언된 변수 foo는 블록 레벨 스코프를 갖는 지역 변수이다.
전역에서 선언된 변수 foo와는 다른 별개의 변수이다. 또한 변수 bar도 블록 레벨 스코프를 갖는 지역 변수이다.
따라서 전역에서는 변수 bar를 참조할 수 없다.
*/