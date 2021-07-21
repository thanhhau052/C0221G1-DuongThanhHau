import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  public title = 'Calculator';
  public result: number;

  constructor() {
  }

  ngOnInit(): void {
  }

// viet phuong thuc
  public calculate(first: string, second: string, operator: string): number {
    // tslint:disable-next-line:radix
    const firstNumber: number = parseInt(first);
    // tslint:disable-next-line:radix
    const secondNumber: number = parseInt(second);
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
