const Foo = () => {};

// 화살표 함수는 prototype 프로퍼티가 없다
console.log(Foo.hasOwnProperty('prototype')); // false

const foo = new Foo(); // TypeError: Foo is not a constructor

/*
화살표 함수는 생성자 함수로 사용할 수 없다. 
생성자 함수는 prototype 프로퍼티를 가지며 prototype 프로퍼티가 가리키는 프로토타입 객체의 constructor를 사용한다. 
하지만 화살표 함수는 prototype 프로퍼티를 가지고 있지 않다.
*/