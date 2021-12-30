import {Component, OnInit} from '@angular/core';
import {DictionaryService} from '../service/dictionary.service';
import {IWord} from '../model/iword';

@Component({
  selector: 'app-detail-dictionary',
  templateUrl: './detail-dictionary.component.html',
  styleUrls: ['./detail-dictionary.component.css']
})
export class DetailDictionaryComponent implements OnInit {
  dictionary: IWord[] = [];

  constructor(private dictionaryService: DictionaryService) {
  }

  ngOnInit(): void {
   this.getAll();
  }

  getAll() {
    this.dictionary = this.dictionaryService.getAll();
  }

}
