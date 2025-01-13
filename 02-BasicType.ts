//Boolean
let isLogin : boolean = false;

//Number
let num : number = 10;

//String
let str : string = 'h1';

//Object
let obj : object = {name: 'Name', age: 29}

//Array
let arr : number[] = [1, 2, 3];
let arr : Array<number> = [1, 2, 3];

//Tuple
let arr : [string, number] = ['hi', 10];

//Enum
enum fruits { apple, banana, orange }
let a: fruits = fruits.apple;
let b: string = fruits[0];

console.log(a) //0
console.log(b) //'apple'

//any
//- 기존에 JS로 된 코드에 타입스크립트를 적용할 경우 활용
let str: any = 'hi';
let num: any = 10;
let arr: any = ['a', 2, true];

//void
//- 변수에 null, undefined 할당 가능. 함수로 설정시 리턴값 설정 불가.
function sayHi() : void {
	console.log('Hi')
}

let a : void = null;
let b : void = undefined;

//NULL, Undefined
let a : null = null
let b : undefined = undefined

//Never
//- 함수의 리턴타입으로 보통 사용, 항상 오류를 출력하거나 리턴값을 절대로 내보내지 않음.
//항상 오류 발생
function invalid(message:string): never {
	throw new Error(message);
}
//무한 루프
function infiniteAnimate(): never {
	while( true } {infiniteAnimate}
}

//사용자 정의 타입
//-사용자가 직접 type 키워드를 사용하여 타입 별칭을 정의 할수 있다.
type operation = {
  data: number[],
  output:(num:number)=>number[]
};
// 사용자 정의 타입 operation 적용 예시
let sum:operation = {
  data: [10, 30, 60],
  output(num){
    return this.data.map(n=>n+num);
  }
};
let multiply:operation = {
  data: [110, 230, 870, 231],
  output(num){
    return this.data.map(n=>n*num);
  }
};

//Union 타입
// - OR연산자 같이 A이거나 B이다 라는 의미의 타입으로 두가지 이상의 타입을 허용하는 경우에 사용
function getAge(age: number | string) : string {
  if (typeof age === 'number') {
    return age.toString();
  }
  else {
    return age;
  }
}

