console.log(Math.round(1.6));    //2
console.log(Math.round(1.4));    //1

function sum(first, second){    //parameter(매개변수)
    console.log('a');
    return first + second;  //return : 출력과 종료를 동시에
    console.log('b');   //돌려보면 b는 찍히지 않는데 return을 만나는 즉시 함수는 실행이 종료되기 때문이다
}

console.log(sum(2,4));   //argument (인자)