function sum(x, y) {
    // 매개변수의 값이 falsy value인 경우, 기본값을 할당한다.
    x = x || 0;
    y = y || 0;
  
    return x + y;
  }
  
  console.log(sum(1));    // 1
  console.log(sum(1, 2)); // 3