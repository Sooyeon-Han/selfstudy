// Solution 2: map(func, this)
function Prefixer(prefix) {
    this.prefix = prefix;
  }
  
  Prefixer.prototype.prefixArray = function (arr) {
    return arr.map(function (x) {
      return this.prefix + ' ' + x;
    }, this); // this: Prefixer 생성자 함수의 인스턴스
  };
  
  var pre = new Prefixer('Hi');
  console.log(pre.prefixArray(['Lee', 'Kim']));