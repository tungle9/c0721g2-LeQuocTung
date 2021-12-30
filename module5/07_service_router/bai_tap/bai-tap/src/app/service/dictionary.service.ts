import {Injectable} from '@angular/core';
import {IWord} from '../model/iword';

@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionary: IWord[] = [{
    word: 'hello', mean: 'xin chao'
  }, {
    word: 'goodbye', mean: 'tam biet'
  }
  ];

  getAll() {
    return this.dictionary;
  }

  constructor() {
  }
}
