import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {EmployeeListComponent} from './empoloyee/employee-list/employee-list.component';
import {EmployeeCreateComponent} from './empoloyee/employee-create/employee-create.component';
import {EmployeeDetailComponent} from './empoloyee/employee-detail/employee-detail.component';
import {EmployeeEditComponent} from './empoloyee/employee-edit/employee-edit.component';
import {CustomerListComponent} from './customer/customer-list/customer-list.component';
import {CustomerCreateComponent} from './customer/customer-create/customer-create.component';


const routes: Routes = [{
  path: 'employee/list',
  component: EmployeeListComponent
}, {
  path: 'employee/create',
  component: EmployeeCreateComponent
},
  {
    path: 'employee/detail/:id',
    component: EmployeeDetailComponent
  },
  {
    path: 'employee/edit/:id',
    component: EmployeeEditComponent
  },
  {
    path: 'customer/list',
    component: CustomerListComponent
  },
  {
    path: 'customer/create',
    component: CustomerCreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
