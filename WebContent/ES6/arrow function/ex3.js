function Prefixer(prefix) {
    this.prefix = prefix;
  }
  
  Prefixer.prototype.prefixArray = function (arr) {
    // (A)
    return arr.map(function (x) {
      return this.prefix + ' ' + x; // (B)
    });
  };
  
  var pre = new Prefixer('Hi');
  console.log(pre.prefixArray(['Lee', 'Kim']));