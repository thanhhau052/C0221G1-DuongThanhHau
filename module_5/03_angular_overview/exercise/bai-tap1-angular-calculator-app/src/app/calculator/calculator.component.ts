import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  public title = 'Calculator';
  public result: any;

  constructor() {
  }

  ngOnInit(): void {
  }


  public calculate(first: number, second: number, operator: string): number{
    // tslint:disable-next-line:radix
    const firstNumber: number = parseInt(first.toLocaleString());
    // tslint:disable-next-line:radix
    const secondNumber: number = parseInt(second.toLocaleString()) ;
    switch (operator) {
      case '+':
        return this.result = firstNumber + secondNumber;
      case '-':
        return this.result = firstNumber - secondNumber;
      case '*':
        return this.result = firstNumber * secondNumber;
      case '/':
        return this.result = firstNumber / secondNumber;
    }
  }


}
