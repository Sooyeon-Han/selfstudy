// Bad
const person = {
    name: 'Lee',
    sayHi: () => console.log(`Hi ${this.name}`)
  };
  
  person.sayHi(); // Hi undefined

  /*
위 예제의 경우, 메소드로 정의한 화살표 함수 내부의 this는 메소드를 소유한 객체, 즉 메소드를 호출한 객체를 가리키지 않고 상위 컨택스트인 전역 객체 window를 가리킨다. 
따라서 화살표 함수로 메소드를 정의하는 것은 바람직하지 않다.
  */