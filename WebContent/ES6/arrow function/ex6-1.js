// Good
const person = {
    name: 'Lee',
  };
  
  Object.prototype.sayHi = function() {
    console.log(`Hi ${this.name}`);
  };
  
  person.sayHi(); // Hi Lee