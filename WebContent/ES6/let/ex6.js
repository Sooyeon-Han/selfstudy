var funcs = [];

//함수의 배열을 생성하는 for 루프의 i는 전역변수다.
for(var i=0; i<3; i++){
    funcs.push(function() {console.log(i);});
}

//배열에서 함수를 꺼내 호출한다.
for(var j=0; j<3; j++){
    funcs[j]();
}