import {Component, OnInit} from '@angular/core';
import {DictionaryService} from '../service/dictionary.service';
import {IWord} from '../model/iword';

@Component({
  selector: 'app-dictinonary',
  templateUrl: './dictinonary.component.html',
  styleUrls: ['./dictinonary.component.css']
})
export class DictinonaryComponent implements OnInit {
  dictionary: IWord[] = [];

  constructor(private dictionaryService: DictionaryService) {
  }

  ngOnInit(): void {
    this.getAll();
  }
  getAll(){
    return this.dictionary =  this.dictionaryService.getAll();
  }
}
