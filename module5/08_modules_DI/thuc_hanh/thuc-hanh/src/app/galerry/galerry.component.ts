import {Component, Inject, Input, OnInit, Optional} from '@angular/core';
import {GalleryConfig} from './token';


@Component({
  selector: 'app-galerry',
  templateUrl: './galerry.component.html',
  styleUrls: ['./galerry.component.css']
})
export class GalerryComponent implements OnInit {
  listImage = [
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=1',
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=2',
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=3',
    'https://via.placeholder.com/1280x420/e91e63/ffffff?text=4'
  ];
  itemWidth: number;
  config = 4;
  constructor(
    @Inject(GalleryConfig)
    @Optional()
      config: number
  ) {
    if (config) {
      this.config = config;
    }
  }



  ngOnInit(): void {
    this.itemWidth = 100 / this.config;
  }

}
