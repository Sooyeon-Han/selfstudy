//10의 의미를 알기 어렵기 때문에 가독성이 좋지 않음
if(rows>10){
}

//값의 의미를 명확히 기술하여 가독성을 향상
const MAXROWS = 10;
if(rows>MAXROWS){
}

//const는 객체에도 사용 가능하나 재할당은 여기서도 금지
const obj = {foo: 123};
obj = {bar: 456};