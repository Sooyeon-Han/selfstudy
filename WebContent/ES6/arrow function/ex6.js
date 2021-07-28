// Bad
const person = {
    name: 'Lee',
  };
  
  Object.prototype.sayHi = () => console.log(`Hi ${this.name}`);
  
  person.sayHi(); // Hi undefined