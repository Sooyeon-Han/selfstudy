// Good
const person = {
    name: 'Lee',
    sayHi() { // === sayHi: function() {
      console.log(`Hi ${this.name}`);
    }
  };
  
  person.sayHi(); // Hi Lee