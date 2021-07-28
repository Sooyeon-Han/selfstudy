window.x = 1;
const normal = function () { return this.x; };
const arrow = () => this.x;

console.log(normal.call({ x: 10 })); // 10
console.log(arrow.call({ x: 10 }));  // 1

//화살표 함수는 call, apply, bind 메소드를 사용하여 this를 변경할 수 없다.