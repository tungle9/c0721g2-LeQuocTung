import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DictinonaryComponent } from './dictinonary/dictinonary.component';
import { DetailDictionaryComponent } from './detail-dictionary/detail-dictionary.component';

@NgModule({
  declarations: [
    AppComponent,
    DictinonaryComponent,
    DetailDictionaryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
