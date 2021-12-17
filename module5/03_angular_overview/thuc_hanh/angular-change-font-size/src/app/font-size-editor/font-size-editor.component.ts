import {Component, OnInit} from '@angular/core';
import {Pet} from '../pet';

@Component({
  selector: 'app-font-size-editor',
  templateUrl: './font-size-editor.component.html',
  styleUrls: ['./font-size-editor.component.css']
})
export class FontSizeEditorComponent implements OnInit {
  pet: Pet = {
    name : 'puppie',
    image: 'http://yourdost-blog-images.s3-ap-southeast-1.amazonaws.com/wp-content/uploads/2016/01/03165939/Dogs.jpg'
};
  fontSize = 14;
  changeFontSizeValue(fontSize) {
    this.fontSize = fontSize;
  }

  constructor() {
  }

  ngOnInit(): void {
  }

}
