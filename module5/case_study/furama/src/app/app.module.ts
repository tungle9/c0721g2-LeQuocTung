import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { GiaoDienComponent } from './giao-dien/giao-dien.component';
import {HttpClientModule} from '@angular/common/http';
import { EmployeeListComponent } from './empoloyee/employee-list/employee-list.component';
import { EmployeeCreateComponent } from './empoloyee/employee-create/employee-create.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { EmployeeEditComponent } from './empoloyee/employee-edit/employee-edit.component';
import { EmployeeDetailComponent } from './empoloyee/employee-detail/employee-detail.component';
import {NgxPaginationModule} from 'ngx-pagination';
import { CustomerListComponent } from './customer/customer-list/customer-list.component';
import { CustomerCreateComponent } from './customer/customer-create/customer-create.component';


@NgModule({
  declarations: [
    AppComponent,
    GiaoDienComponent,
    EmployeeListComponent,
    EmployeeCreateComponent,
    EmployeeEditComponent,
    EmployeeDetailComponent,
    CustomerListComponent,
    CustomerCreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
