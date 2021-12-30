import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GalerryComponent } from './galerry/galerry.component';
import {GalleryConfig} from './galerry/token';
import {GalleryModule} from './gallery/gallery.module';

@NgModule({
  declarations: [
    AppComponent,
    GalerryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    GalleryModule
  ],
  providers: [
    {provide: GalleryConfig, useValue: 3}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
