const user = {name: 'Lee'};

//const 변수는 재할당이 금지됨
//user = {};    //TypeError : Assignment to constant variable

//객체의 내용은 변경할 수 있다

user.name = 'Kim';

console.log(user);  //{name: 'Kim'}

/*
객체의 내용이 변경되더라도 객체 타입 변수에 할당된 주소값은 변경되지 않는다. 
따라서 객체 타입 변수 선언에는 const를 사용하는 것이 좋다. 
만약에 명시적으로 객체 타입 변수의 주소값을 변경(재할당)하여야 한다면 let을 사용한다.
*/