/**
함수를 호출할 때 매개변수의 개수만큼 인수를 전달하는 것이 일반적이지만 그렇지 않은 경우에도 에러가 발생하지는 않는다. 
함수는 매개변수의 개수와 인수의 개수를 체크하지 않는다. 
인수가 부족한 경우, 매개변수의 값은 undefined이다.
 */

function sum(x, y) {
    return x + y;
  }
  
  console.log(sum(1)); // NaN