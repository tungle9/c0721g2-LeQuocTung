import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DictinonaryComponent} from './dictinonary/dictinonary.component';
import {DetailDictionaryComponent} from './detail-dictionary/detail-dictionary.component';


const routes: Routes = [{
  path: 'dictionary',
  component: DictinonaryComponent
}, {
  path: 'detail',
  component: DetailDictionaryComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
