import {Component, OnInit} from '@angular/core';

@Component({
  selector: 'app-color-test',
  templateUrl: './color-test.component.html',
  styleUrls: ['./color-test.component.css']
})

export class ColorTestComponent implements OnInit {
  color = 'pink';


  constructor() {
  }

  ngOnInit(): void {
  }

  changeYellow() {
    this.color = 'yellow';
  }

  changeBlue() {
    this.color = 'blue';
  }

  changeRed() {
    this.color = 'red';
  }


}
