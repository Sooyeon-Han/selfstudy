/*
ES6 템플릿 리터럴은 일반적인 문자열과 달리 여러 줄에 걸쳐 문자열을 작성할 수 있으며, 
템플릿 리터럴 내의 모든 white-space는 있는 그대로 적용된다.
*/

const template = `<ul class="nav-items'>
    <li><a href="#home">Home</a></li>
    <li><a href="#news">News</a></li>
    <li><a href="#contact">Contact</a></li>
    <li><a href="#about">About</a></li>
</ul>`

console.log(template);