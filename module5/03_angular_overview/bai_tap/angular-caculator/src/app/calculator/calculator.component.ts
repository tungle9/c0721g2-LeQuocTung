import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  numberA: number;
  numberB: number;
  output: number;
  operator = '+';

  constructor() {
  }

  ngOnInit(): void {
  }

  onFirstChange(value) {
    this.numberA = Number(value);
  }

  onSecondChange(value) {
    this.numberB = Number(value);
  }

  onSelectChange(value) {
    this.operator = value;
  }
  calculate() {
    switch (this.operator) {
      case '+':
        this.output = this.numberA + this.numberB;
        break;
      case '-' :
        this.output = this.numberA - this.numberB;
        break;
      case '*' :
        this.output = this.numberA * this.numberB;
        break;
      case '/' :
        this.output = this.numberA / this.numberB;
        break;
    }
  }
}
