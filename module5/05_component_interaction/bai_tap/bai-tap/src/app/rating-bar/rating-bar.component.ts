import {Component, Input, OnInit} from '@angular/core';
import {RatingUnit} from '../ratingunit';


@Component({
  selector: 'app-rating-bar',
  templateUrl: './rating-bar.component.html',
  styleUrls: ['./rating-bar.component.css']
})
export class RatingBarComponent implements OnInit {
  @Input() ratingCount = 10;
  rating: RatingUnit = {
   value: 4,
    active: 2
  };


  constructor() {
  }


  ngOnInit(): void {
  }

}
