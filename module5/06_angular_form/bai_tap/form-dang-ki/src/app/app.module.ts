import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FormRegisterComponent } from './form-register/form-register.component';
import {ReactiveFormsModule} from '@angular/forms';
import { LoginComponetComponent } from './login-componet/login-componet.component';

@NgModule({
  declarations: [
    AppComponent,
    FormRegisterComponent,
    LoginComponetComponent
  ],
  imports: [
    BrowserModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
