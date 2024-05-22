const tetzObj = {
  name: '이효석',
  isOld: true,
  sayHello: function () {
    console.log(this.name);
  },
  nestedObj: {
    name: '방시혁',
    isOld: true,
    sayHello: function () {
      console.log(this.name);
    },
  },
};

tetzObj.sayHello();
tetzObj.nestedObj.sayHello();
